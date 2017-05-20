package com.xgestion.listas;

import com.xgestion2.entities.maestros.Producto ;
import com.xgestion2.repository.ProductoRepository;
import java.awt.BorderLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class ListaProductosConMismoCodigo extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel modelo;
	private JButton btnBuscar;

        private String codigo;
	private static String seleccionado = "";
        private static String seleccionadoNombre = "";
	private static String sql;
	private static List<Producto> x;
        private ProductoRepository productoRepo = new ProductoRepository();
	private JTextField textBuscar;
	private static JInternalFrame frame;
	private static int rowIndex = 0;
	private JLabel lblNewLabel;
	private JPanel buttonPane;
	private JButton cancelButton;
	private JButton okButton;
	
	public ListaProductosConMismoCodigo(String codigo) {
            seleccionado = "";
            setTitle("Seleccionar Campo");
            this.codigo=codigo;

            setModal(true);
            setType(Type.POPUP);
            setBounds(100, 100, 780, 556);
            getContentPane().setLayout(new BorderLayout());
            contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
            getContentPane().add(contentPanel, BorderLayout.CENTER);
            contentPanel.setLayout(null);

            JScrollPane scrollPane = new JScrollPane();
            scrollPane.setBounds(10, 55, 740, 413);
            contentPanel.add(scrollPane);

            table = new javax.swing.JTable();
            table.setAutoCreateRowSorter(true);
            table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
                }
            ));
            table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
            table.setAutoscrolls(false);
            table.setRowHeight(32);
            table.setShowVerticalLines(false);
            scrollPane.setViewportView(table);
            table.addMouseListener(new MouseAdapter() {
		public void mousePressed(MouseEvent e) {
                    if(e.getClickCount() == 2){
                        rowIndex = table.getSelectedRow();
			seleccionado = ""+table.getModel().getValueAt(rowIndex, 0);
                        seleccionadoNombre = ""+table.getModel().getValueAt(rowIndex, 1);
			dispose();
                    }
		}
            });

            generarTabla();

            textBuscar = new JTextField();
            textBuscar.setBounds(10, 11, 651, 33);
            contentPanel.add(textBuscar);
            textBuscar.setColumns(10);
            textBuscar.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent ev) {
                    if(ev.getKeyCode() != KeyEvent.VK_ENTER && ev.getKeyCode() != KeyEvent.VK_DOWN && ev.getKeyCode() != KeyEvent.VK_UP)
                        btnBuscar.doClick();
                    if(ev.getKeyCode() == KeyEvent.VK_ESCAPE)
                        dispose();
                }
                @Override
                public void keyPressed(KeyEvent ev) {

                    if(ev.getKeyCode() == KeyEvent.VK_DOWN){
                        if(rowIndex < (table.getRowCount() - 1)){
                            rowIndex = rowIndex + 1;
                            table.setRowSelectionInterval((rowIndex), (rowIndex));
                            table.scrollRectToVisible(table.getCellRect(table.getSelectedRow(), 0, false));
                        }else{
                            rowIndex = 0;
                            table.setRowSelectionInterval((rowIndex), (rowIndex));
                            table.scrollRectToVisible(table.getCellRect(table.getSelectedRow(), 0, false));
                        }
                    }else if(ev.getKeyCode() == KeyEvent.VK_UP){
                        if(rowIndex > 0){
                            rowIndex = rowIndex - 1;
                            table.setRowSelectionInterval((rowIndex), (rowIndex));
                            table.scrollRectToVisible(table.getCellRect(table.getSelectedRow(), 0, false));
                        }else{
                            rowIndex = (table.getRowCount() - 1);
                            table.setRowSelectionInterval((rowIndex), (rowIndex));
                            table.scrollRectToVisible(table.getCellRect(table.getSelectedRow(), 0, false));
                        }
                    }
                }
            });

            btnBuscar = new JButton("Buscar");
            btnBuscar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    String texto = textBuscar.getText();
                    generarTabla(texto);
                }
            });
            btnBuscar.setBounds(673, 11, 77, 32);
            contentPanel.add(btnBuscar);
            {
                lblNewLabel = new JLabel("Enter: Elegir fila seleccionada - Flecha abajo/arriba: Mover");
                lblNewLabel.setForeground(Color.GRAY);
                lblNewLabel.setBounds(10, 481, 740, 14);
                contentPanel.add(lblNewLabel);
                lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
            }
            {
                buttonPane = new JPanel();
                getContentPane().add(buttonPane, BorderLayout.SOUTH);
                {
                    buttonPane.setLayout(null);
                    {
                        cancelButton = new JButton("Cancelar");
                        cancelButton.setBounds(0, 0, 75, 23);
                        buttonPane.add(cancelButton);
                        cancelButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent arg0) {
                                dispose();
                            }
                        });
                        cancelButton.setActionCommand("Cancelar");
                    }
                    okButton = new JButton("Seleccionar");
                    okButton.setBounds(0, 0, 87, 23);
                    buttonPane.add(okButton);
                    okButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                                if(table.getRowCount() > 0){
                                        int rowIndex = table.getSelectedRow();
                                        seleccionado = ""+table.getModel().getValueAt(rowIndex, 0);
                                        seleccionadoNombre  = ""+table.getModel().getValueAt(rowIndex, 1);
                                        dispose();
                            }
                        }
                    });
                    okButton.setActionCommand("Seleccionar");
                    getRootPane().setDefaultButton(okButton);
                }
            }
	}

    public ListaProductosConMismoCodigo(Object object, List<Producto > x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
    public String getSeleccionado(){
        return seleccionado;
    }
    public String getSeleccionadoNombre(){
        return seleccionadoNombre;
    }

    public static String getSql() {
            return sql;
    }

    public static void setSql(String sql) {
            ListaProductosConMismoCodigo.sql = sql;
    }

    public void generarTabla(){	

        //TRAE LISTA 
        x = productoRepo.getAllProductByCodigo(this.codigo);
        
        //CABECERA TABLA
        Object[] columnNames = {"ID", "NOMBRE","CODIGO","PRECIO VENTA 1","PRECIO VENTA 2"};

        //CUERPO TABLA
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames)
        {
             @Override
            public boolean isCellEditable(int row, int column) {
                //return column == 3 || column==4 || column==5 ? true : false;
                return false;
            }
        };

        for (Producto  s : x) {
            Object[] o = new Object[5];
            o[0] = s.getId().toString();
            o[1] = s.getNombre();
            o[2] = s.getCodigoBarras();
            o[3] = s.getPrecioVenta().toString();
            o[4] = s.getPrecioVenta2().toString();
            model.addRow(o);
        }
        table.setModel(model);

        //PACKING
        table.getColumnModel().getColumn(0).setPreferredWidth(40);

        repaint();
        revalidate();
    }
	
    public void generarTabla(String buscar){
      //CABECERA TABLA
        Object[] columnNames = {"ID", "NOMBRE","CODIGO","PRECIO VENTA 1","PRECIO VENTA 2"};

        //CUERPO TABLA
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames)
        {
            @Override
            public boolean isCellEditable(int row, int column) {
                //return column == 3 || column==4 || column==5 ? true : false;
                return false;
            }
        };

        for (Producto  s : x) {
            String nombre = s.getNombre();

            if(nombre.toLowerCase().contains(buscar.toLowerCase())){
                Object[] o = new Object[5];
                o[0] = s.getId().toString();
                o[1] = s.getNombre();
                o[2] = s.getCodigoBarras();
                o[3] = s.getPrecioVenta().toString();
                o[4] = s.getPrecioVenta2().toString();
                model.addRow(o);
            }
        }
        table.setModel(model);

        //PACKING
        table.getColumnModel().getColumn(0).setPreferredWidth(40);

        repaint();
        revalidate();
    }


    /**
     * Sets the preferred width of the visible column specified by vColIndex. The column
     * will be just wide enough to show the column head and the widest cell in the column.
     * margin pixels are added to the left and right
     * (resulting in an additional width of 2*margin pixels).
     */ 
    public static void packColumn(JTable table, int vColIndex, int margin) {
        DefaultTableColumnModel colModel = (DefaultTableColumnModel)table.getColumnModel();
        TableColumn col = colModel.getColumn(vColIndex);
        int width = 0;

        // Get width of column header
        TableCellRenderer renderer = col.getHeaderRenderer();
        if (renderer == null) {
            renderer = table.getTableHeader().getDefaultRenderer();
        }
        java.awt.Component comp = renderer.getTableCellRendererComponent(
            table, col.getHeaderValue(), false, false, 0, 0);
        width = comp.getPreferredSize().width;

        // Get maximum width of column data
        for (int r=0; r<table.getRowCount(); r++) {
            renderer = table.getCellRenderer(r, vColIndex);
            comp = renderer.getTableCellRendererComponent(
                table, table.getValueAt(r, vColIndex), false, false, r, vColIndex);
            width = Math.max(width, comp.getPreferredSize().width);
        }

        // Add margin
        width += 2*margin;

        // Set the width
        col.setPreferredWidth(width);
    }

    private boolean isContainExactWord(String fullString, String partWord){
        String pattern = "\\b"+partWord+"\\b";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(fullString);
        return m.find();
    }
}
