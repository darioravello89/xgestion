/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vistas.ventas;

import com.repository.transaccionales.VentaRepository;
import com.xgestion2.entities.maestros.Computadora;
import com.xgestion2.entities.maestros.Sucursal;
import com.xgestion2.entities.maestros.Usuario;
import com.xgestion2.entities.transaccionales.ClaveCompuestaTx;
import com.xgestion2.entities.transaccionales.Venta;
import com.xgestion2.repository.ComputadoraRepository;
import com.xgestion2.repository.SucursalRepository;
import com.xgestion2.repository.UsuarioRepository;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import xgestion.FormPrincipal;

/**
 *
 * @author dario
 */
public class FormVentas extends javax.swing.JInternalFrame {

    private String titulo;
    
    private final SucursalRepository sucursalRepo = new SucursalRepository();
    private final ComputadoraRepository computadoraRepo = new ComputadoraRepository();
    private final UsuarioRepository usuarioRepo = new UsuarioRepository();
    
    public FormVentas() {
        titulo = "Ventas";
        
        initComponents();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        textoFecha.setText(dateFormat.format(date));
        
        atajoTeclas();
        poblarTabla("",textoFecha.getText());
      
        repaint();
        revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTextBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        textoFecha = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelEsquina = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboUsuario = new javax.swing.JComboBox();
        comboComputadora = new javax.swing.JComboBox();
        comboSucursal = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(this.titulo);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/favicon.png"))); // NOI18N
        setName(""); // NOI18N
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(34);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowVerticalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(889, 50));
        jLayeredPane1.setOpaque(true);

        jTextBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextBuscar.setToolTipText("Buscar");
        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });
        jTextBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextBuscarKeyReleased(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Buscar3.png"))); // NOI18N
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        textoFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yy"))));
        textoFecha.setText("01/01/01");
        textoFecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEsquina.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEsquina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelEsquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/esquina.png"))); // NOI18N
        jLabelEsquina.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabelEsquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 147));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText(this.titulo);

        comboUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboUsuarioItemStateChanged(evt);
            }
        });

        comboComputadora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboComputadora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboComputadoraItemStateChanged(evt);
            }
        });
        comboComputadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboComputadoraActionPerformed(evt);
            }
        });

        comboSucursal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboSucursal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSucursalItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(comboComputadora, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(textoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboComputadora, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane1.setLayer(jTextBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButtonBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textoFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comboUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comboComputadora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comboSucursal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, java.awt.BorderLayout.PAGE_START);

        getAccessibleContext().setAccessibleName("Ventas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            int rowIndex = jTable1.getSelectedRow();
 
            String fecha = jTable1.getModel().getValueAt(rowIndex, 0).toString();
            String sucursal = jTable1.getModel().getValueAt(rowIndex, 1).toString();
            String computadora = jTable1.getModel().getValueAt(rowIndex, 1).toString();
            String usuario = jTable1.getModel().getValueAt(rowIndex, 1).toString();
            
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
            Date date=null;
            try {
                date = formatter.parse(fecha);
            } catch (ParseException ex) {
                Logger.getLogger(FormVentas.class.getName()).log(Level.SEVERE, null, ex);
            }

            ClaveCompuestaTx clave = new ClaveCompuestaTx();
            clave.setComputadora(Long.parseLong(computadora));
            clave.setSucursal(Long.parseLong(sucursal));
            clave.setUsuario(Long.parseLong(usuario));
            clave.setFechaHora(date);
            FormVenta cm = new FormVenta(clave);
            cm.setVisible(true);
            
            poblarTabla(jTextBuscar.getText(),textoFecha.getText());
	}
    }//GEN-LAST:event_jTable1MouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
         poblarTabla(jTextBuscar.getText(),textoFecha.getText());
    }//GEN-LAST:event_formFocusGained

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        
    }//GEN-LAST:event_formKeyReleased

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        poblarTabla(jTextBuscar.getText(),textoFecha.getText());
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyReleased
        // TODO add your handling code here:
        poblarTabla(jTextBuscar.getText(),textoFecha.getText());
    }//GEN-LAST:event_jTextBuscarKeyReleased

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void comboComputadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboComputadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboComputadoraActionPerformed

    private void comboUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboUsuarioItemStateChanged
        // TODO add your handling code here:
         poblarTabla(jTextBuscar.getText(),textoFecha.getText());
    }//GEN-LAST:event_comboUsuarioItemStateChanged

    private void comboComputadoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboComputadoraItemStateChanged
        // TODO add your handling code here:
         poblarTabla(jTextBuscar.getText(),textoFecha.getText());
    }//GEN-LAST:event_comboComputadoraItemStateChanged

    private void comboSucursalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSucursalItemStateChanged
        // TODO add your handling code here:
         poblarTabla(jTextBuscar.getText(),textoFecha.getText());
    }//GEN-LAST:event_comboSucursalItemStateChanged

    private void poblarTabla(String texto, String fecha){
        
        String[] sucursal = comboSucursal.getSelectedItem().toString().split("-");
        String[] computadora  = comboComputadora.getSelectedItem().toString().split("-");
        String[] usuario  = comboUsuario.getSelectedItem().toString().split("-");
                
                
        VentaRepository a = new VentaRepository();
        List<Venta> x = a.getAllVentasActivasFecha(fecha,texto,sucursal[0],computadora[0],usuario[0]);
        
        //CABECERA TABLA
        Object[] columnNames = {"FECHA","SUCURSAL","COMPUTADORA","USUARIO","TOTAL"};
        
        //CUERPO TABLA
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames)
        {
             @Override
            public boolean isCellEditable(int row, int column) {
                //return column == 3 || column==4 || column==5 ? true : false;
                return false;
            }
        };
        
        //POBLAR REGISTROS
        for (Venta s : x) {
            if(s.getNotas().toUpperCase().contains(texto.toUpperCase())){
                Object[] o = new Object[5];
                o[0] = s.getId().getFechaHora();
                o[1] = s.getId().getSucursal();
                o[2] = s.getId().getComputadora();
                o[3] = s.getId().getUsuario();
                o[4] = s.getTotal();
                model.addRow(o);
            }
        }
        
        jTable1.setModel(model);
        repaint();
        revalidate();
    }
    
    public final void atajoTeclas(){
        InputMap map = this.getInputMap(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
	map.put(KeyStroke.getKeyStroke(title).getKeyStroke(KeyEvent.VK_ESCAPE, 0),"salir");
	//SALIR
	this.getActionMap().put("salir", new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
    	});
    }
    
    public void pueblaComboBoxes(){
        List<Sucursal> sucursal = sucursalRepo.getAllActivos();
        comboSucursal.removeAllItems();
        
        for (Sucursal a : sucursal) {
            comboSucursal.addItem(a.getId()+"-"+a.getNombre());
        }
        
        List<Computadora> computadoras = computadoraRepo.getAllActivos();
        comboComputadora.removeAllItems();
        
        for (Computadora b : computadoras) {
            comboComputadora.addItem(b.getId()+"-"+b.getNombre());
        }
        
         List<Usuario> usuarios = usuarioRepo.getAllActivos();
        comboUsuario.removeAllItems();
        
        for (Usuario c : usuarios) {
            comboUsuario.addItem(c.getId()+"-"+c.getNombre());
        }
        
        comboSucursal.setSelectedItem(FormPrincipal.miSucursal.getId()+"-"+FormPrincipal.miSucursal.getNombre());
        comboComputadora.setSelectedItem(FormPrincipal.miComputadora.getId()+"-"+FormPrincipal.miComputadora.getNombre());
        comboUsuario.setSelectedItem(FormPrincipal.miUsuario.getId()+"-"+FormPrincipal.miUsuario.getNombre());
        
        if(Boolean.valueOf(FormPrincipal.prop.getProperty("isPOS")))
            comboSucursal.setEnabled(false);
                        
        repaint();
        revalidate();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboComputadora;
    private javax.swing.JComboBox comboSucursal;
    private javax.swing.JComboBox comboUsuario;
    public static javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEsquina;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JFormattedTextField textoFecha;
    // End of variables declaration//GEN-END:variables
}