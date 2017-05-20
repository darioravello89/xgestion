/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vistas.ventas;

import com.repository.transaccionales.VentaDetalleRepository;
import com.repository.transaccionales.VentaRepository;
import com.xgestion.listas.ListaClientes;
import com.xgestion.listas.ListaPagos;
import com.xgestion.listas.ListaProductos;
import com.xgestion2.entities.maestros.Computadora;
import com.xgestion2.entities.maestros.Producto;
import com.xgestion2.entities.maestros.Sucursal;
import com.xgestion2.entities.maestros.Usuario;
import com.xgestion2.entities.transaccionales.ClaveCompuestaTx;
import com.xgestion2.entities.transaccionales.Venta;
import com.xgestion2.entities.transaccionales.VentaDetalle;
import com.xgestion2.repository.ComputadoraRepository;
import com.xgestion2.repository.ProductoRepository;
import com.xgestion2.repository.SucursalRepository;
import com.xgestion2.repository.UsuarioRepository;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class FormVenta extends javax.swing.JInternalFrame {

    private String titulo;
    
    private final SucursalRepository sucursalRepo = new SucursalRepository();
    private final ComputadoraRepository computadoraRepo = new ComputadoraRepository();
    private final UsuarioRepository usuarioRepo = new UsuarioRepository();
    private final VentaRepository ventaRepo = new VentaRepository();
    private final VentaDetalleRepository ventaDetalleRepo = new VentaDetalleRepository();
    
    private final ProductoRepository productoRepo = new ProductoRepository();
        
    private Venta venta = new Venta();
    private VentaDetalle ventaDetalle = new VentaDetalle();
    private ClaveCompuestaTx id = new ClaveCompuestaTx();
    
    public FormVenta(ClaveCompuestaTx id) {
        titulo = "Ventas";
        this.id = id;
        
        if(this.id == null){
            venta = ventaRepo.nuevaVenta();
        }else{
            
        }

        initComponents();
        atajoTeclas();
        
        cargarCabecera();
        poblarTabla();
      
        repaint();
        revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelSuperior = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        textPago = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNotas = new javax.swing.JTextField();
        textClienteNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textCliente = new javax.swing.JFormattedTextField();
        textPagoNumero = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textComputadora = new javax.swing.JTextField();
        textSucursal = new javax.swing.JTextField();
        textFecha = new javax.swing.JTextField();
        panelInferior = new javax.swing.JPanel();
        textSubtotal = new javax.swing.JTextField();
        textDescuentos = new javax.swing.JTextField();
        textImpuestos = new javax.swing.JTextField();
        textTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textProducto = new javax.swing.JTextField();
        botonListaProductos = new javax.swing.JButton();
        textProductoNombre = new javax.swing.JTextField();
        textCantidadProducto = new javax.swing.JFormattedTextField();
        botonCierraImprime = new javax.swing.JButton();
        botonCierraVenta = new javax.swing.JButton();
        botonPresupuesto = new javax.swing.JButton();
        botonCuentaCorriente = new javax.swing.JButton();
        textDescuentoOfertas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textDescuentoPagos = new javax.swing.JTextField();
        textDescuentoManual = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        jTextField3.setEditable(false);
        jTextField3.setText("0");

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

        panelSuperior.setLayout(new javax.swing.BoxLayout(panelSuperior, javax.swing.BoxLayout.LINE_AXIS));

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

        panelSuperior.add(jScrollPane2);

        getContentPane().add(panelSuperior, java.awt.BorderLayout.CENTER);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(889, 50));
        jLayeredPane1.setOpaque(true);

        textPago.setEditable(false);
        textPago.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        textPago.setForeground(new java.awt.Color(0, 0, 0));
        textPago.setToolTipText("");
        textPago.setMinimumSize(new java.awt.Dimension(60, 28));
        textPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPagoActionPerformed(evt);
            }
        });
        textPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textPagoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CLIENTE (F1)* :");
        jLabel2.setMinimumSize(new java.awt.Dimension(70, 22));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PAGO (F2)* :");
        jLabel3.setMinimumSize(new java.awt.Dimension(70, 22));

        textNotas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        textNotas.setToolTipText("");
        textNotas.setMinimumSize(new java.awt.Dimension(60, 28));
        textNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNotasActionPerformed(evt);
            }
        });
        textNotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNotasKeyReleased(evt);
            }
        });

        textClienteNombre.setEditable(false);
        textClienteNombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        textClienteNombre.setForeground(new java.awt.Color(0, 0, 0));
        textClienteNombre.setToolTipText("");
        textClienteNombre.setMinimumSize(new java.awt.Dimension(60, 28));
        textClienteNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textClienteNombreActionPerformed(evt);
            }
        });
        textClienteNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textClienteNombreKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("NOTAS (F3) :");
        jLabel5.setMinimumSize(new java.awt.Dimension(70, 22));

        textCliente.setEditable(false);
        textCliente.setForeground(new java.awt.Color(0, 0, 0));
        textCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textCliente.setText("0");
        textCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textClienteFocusLost(evt);
            }
        });

        textPagoNumero.setEditable(false);
        textPagoNumero.setForeground(new java.awt.Color(0, 0, 0));
        textPagoNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textPagoNumero.setText("0");
        textPagoNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("SUCURSAL:");
        jLabel12.setMinimumSize(new java.awt.Dimension(70, 22));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("FECHA");
        jLabel13.setMinimumSize(new java.awt.Dimension(70, 22));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("COMPUTADORA:");
        jLabel14.setMinimumSize(new java.awt.Dimension(70, 22));

        textComputadora.setEditable(false);
        textComputadora.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        textComputadora.setForeground(new java.awt.Color(0, 0, 0));
        textComputadora.setToolTipText("");
        textComputadora.setMinimumSize(new java.awt.Dimension(60, 28));
        textComputadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textComputadoraActionPerformed(evt);
            }
        });
        textComputadora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textComputadoraKeyReleased(evt);
            }
        });

        textSucursal.setEditable(false);
        textSucursal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        textSucursal.setForeground(new java.awt.Color(0, 0, 0));
        textSucursal.setToolTipText("");
        textSucursal.setMinimumSize(new java.awt.Dimension(60, 28));
        textSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSucursalActionPerformed(evt);
            }
        });
        textSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSucursalKeyReleased(evt);
            }
        });

        textFecha.setEditable(false);
        textFecha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        textFecha.setForeground(new java.awt.Color(0, 0, 0));
        textFecha.setToolTipText("");
        textFecha.setMinimumSize(new java.awt.Dimension(60, 28));
        textFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFechaActionPerformed(evt);
            }
        });
        textFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFechaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textClienteNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(textFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(textPagoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPago, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                    .addComponent(textSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(textComputadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textComputadora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPago, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textPagoNumero, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jLayeredPane1.setLayer(textPago, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textNotas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textClienteNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textPagoNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textComputadora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textSucursal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, java.awt.BorderLayout.PAGE_START);

        panelInferior.setBackground(new java.awt.Color(255, 255, 255));
        panelInferior.setPreferredSize(new java.awt.Dimension(1096, 200));

        textSubtotal.setEditable(false);
        textSubtotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textSubtotal.setText("0");
        textSubtotal.setMinimumSize(new java.awt.Dimension(80, 22));

        textDescuentos.setEditable(false);
        textDescuentos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textDescuentos.setText("0");
        textDescuentos.setMinimumSize(new java.awt.Dimension(80, 22));

        textImpuestos.setEditable(false);
        textImpuestos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textImpuestos.setText("0");
        textImpuestos.setMinimumSize(new java.awt.Dimension(80, 22));

        textTotal.setEditable(false);
        textTotal.setBackground(new java.awt.Color(0, 0, 0));
        textTotal.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        textTotal.setForeground(new java.awt.Color(51, 255, 102));
        textTotal.setText("0");
        textTotal.setDisabledTextColor(new java.awt.Color(102, 255, 102));
        textTotal.setMinimumSize(new java.awt.Dimension(80, 22));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("SUBTOTAL:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("DESCUENTOS:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("IMPUESTOS:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("TOTAL:");

        textProducto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        textProducto.setToolTipText("Buscar");
        textProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProductoActionPerformed(evt);
            }
        });
        textProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textProductoKeyReleased(evt);
            }
        });

        botonListaProductos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonListaProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Caja.png"))); // NOI18N
        botonListaProductos.setText("F8");
        botonListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaProductosActionPerformed(evt);
            }
        });

        textProductoNombre.setEditable(false);
        textProductoNombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        textProductoNombre.setToolTipText("Buscar");
        textProductoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProductoNombreActionPerformed(evt);
            }
        });
        textProductoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textProductoNombreKeyReleased(evt);
            }
        });

        textCantidadProducto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        textCantidadProducto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textCantidadProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCantidadProductoKeyReleased(evt);
            }
        });

        botonCierraImprime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonCierraImprime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Impresora.png"))); // NOI18N
        botonCierraImprime.setText("F4");
        botonCierraImprime.setToolTipText("CIERRA VENTA E IMPRIME TICKET");
        botonCierraImprime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCierraImprimeActionPerformed(evt);
            }
        });

        botonCierraVenta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonCierraVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Dolares2.png"))); // NOI18N
        botonCierraVenta.setText("F5");
        botonCierraVenta.setToolTipText("CIERRA VENTA SIN TICKET");
        botonCierraVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCierraVentaActionPerformed(evt);
            }
        });

        botonPresupuesto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonPresupuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35HojaBlanca.png"))); // NOI18N
        botonPresupuesto.setText("F6");
        botonPresupuesto.setToolTipText("CREA PRESUPUESTO");
        botonPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPresupuestoActionPerformed(evt);
            }
        });

        botonCuentaCorriente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonCuentaCorriente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35HojaCalculo.png"))); // NOI18N
        botonCuentaCorriente.setText("F7");
        botonCuentaCorriente.setToolTipText("ENVIA VENTA A CC CLIENTE");
        botonCuentaCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuentaCorrienteActionPerformed(evt);
            }
        });

        textDescuentoOfertas.setEditable(false);
        textDescuentoOfertas.setBackground(new java.awt.Color(255, 153, 153));
        textDescuentoOfertas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textDescuentoOfertas.setForeground(new java.awt.Color(0, 0, 0));
        textDescuentoOfertas.setText("0");
        textDescuentoOfertas.setMinimumSize(new java.awt.Dimension(50, 22));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("OFERTAS:");
        jLabel9.setMaximumSize(new java.awt.Dimension(150, 22));
        jLabel9.setMinimumSize(new java.awt.Dimension(50, 22));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("PAGOS:");
        jLabel10.setMaximumSize(new java.awt.Dimension(150, 22));
        jLabel10.setMinimumSize(new java.awt.Dimension(50, 22));

        textDescuentoPagos.setEditable(false);
        textDescuentoPagos.setBackground(new java.awt.Color(255, 153, 153));
        textDescuentoPagos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textDescuentoPagos.setForeground(new java.awt.Color(0, 0, 0));
        textDescuentoPagos.setText("0");
        textDescuentoPagos.setMinimumSize(new java.awt.Dimension(50, 22));

        textDescuentoManual.setEditable(false);
        textDescuentoManual.setBackground(new java.awt.Color(255, 153, 153));
        textDescuentoManual.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textDescuentoManual.setForeground(new java.awt.Color(0, 0, 0));
        textDescuentoManual.setText("0");
        textDescuentoManual.setMinimumSize(new java.awt.Dimension(50, 22));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("MANUAL:");
        jLabel11.setMaximumSize(new java.awt.Dimension(150, 22));
        jLabel11.setMinimumSize(new java.awt.Dimension(50, 22));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Codigo de Barra");
        jRadioButton1.setToolTipText("");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Codigo de Proveedor");
        jRadioButton2.setToolTipText("");
        jRadioButton2.setActionCommand("Codigo de Prveedor");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Codigo Interno");
        jRadioButton3.setToolTipText("");
        jRadioButton3.setActionCommand("Codigo de Prveedor");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInferiorLayout = new javax.swing.GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInferiorLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textDescuentoOfertas, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textDescuentoPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textDescuentoManual, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                                .addComponent(botonListaProductos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textProductoNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCantidadProducto)))
                        .addGap(30, 30, 30)))
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(textImpuestos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textDescuentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(textSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCierraImprime)
                    .addComponent(botonCierraVenta)
                    .addComponent(botonPresupuesto)
                    .addComponent(botonCuentaCorriente))
                .addContainerGap())
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textDescuentoOfertas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textDescuentoPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textDescuentoManual, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonListaProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProductoNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCantidadProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap())
            .addGroup(panelInferiorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(textSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCierraImprime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textDescuentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(botonCierraVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textImpuestos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(botonPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCuentaCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        getContentPane().add(panelInferior, java.awt.BorderLayout.PAGE_END);

        getAccessibleContext().setAccessibleName("Ventas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount() == 2){
            int rowIndex = jTable1.getSelectedRow();
            String id = ""+jTable1.getModel().getValueAt(rowIndex, 0);
            
//            FormVenta cm = new FormVenta(null,true,Long.valueOf(id));
//            cm.setVisible(true);
            
            poblarTabla();
	}
    }//GEN-LAST:event_jTable1MouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
         poblarTabla();
    }//GEN-LAST:event_formFocusGained

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        
    }//GEN-LAST:event_formKeyReleased

    private void textClienteNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClienteNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textClienteNombreKeyReleased

    private void textClienteNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textClienteNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textClienteNombreActionPerformed

    private void textNotasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNotasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textNotasKeyReleased

    private void textNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNotasActionPerformed

    private void textPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPagoKeyReleased
        // TODO add your handling code here:
        poblarTabla();
    }//GEN-LAST:event_textPagoKeyReleased

    private void textPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPagoActionPerformed

    private void textProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProductoActionPerformed

    private void textProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProductoKeyReleased
        procesarProducto();
        
    }//GEN-LAST:event_textProductoKeyReleased

    private void botonListaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaProductosActionPerformed
        ListaProductos x = new ListaProductos();
        x.setVisible(true);
        textProducto.setText(x.getSeleccionado());
        textProductoNombre.setText(x.getSeleccionadoNombre());
        textProducto.requestFocus();
    }//GEN-LAST:event_botonListaProductosActionPerformed

    private void textProductoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProductoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProductoNombreActionPerformed

    private void textProductoNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProductoNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textProductoNombreKeyReleased

    private void botonCierraImprimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCierraImprimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCierraImprimeActionPerformed

    private void botonCierraVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCierraVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCierraVentaActionPerformed

    private void botonPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPresupuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPresupuestoActionPerformed

    private void botonCuentaCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuentaCorrienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCuentaCorrienteActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void textComputadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textComputadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textComputadoraActionPerformed

    private void textComputadoraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textComputadoraKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textComputadoraKeyReleased

    private void textSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSucursalActionPerformed

    private void textSucursalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSucursalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textSucursalKeyReleased

    private void textFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFechaActionPerformed

    private void textFechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFechaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textFechaKeyReleased

    private void textClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textClienteFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textClienteFocusLost

    private void textCantidadProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadProductoKeyReleased
        procesarProducto();
    }//GEN-LAST:event_textCantidadProductoKeyReleased

    private void procesarProducto(){
        Producto produ = productoRepo.getProductByCodigo(textProducto.getText());
        if(produ!=null){
 
            Double cantidad = Double.parseDouble(textCantidadProducto.getText().replace(',', '.'));
            ClaveCompuestaTx id = new ClaveCompuestaTx();
//            ClaveCompuestaTx id, Date fechaHoraVenta, Producto producto, Double cantidad, Double precioUnitario, 
//            Double precioTotal, Double descuento
            ventaDetalle = new VentaDetalle(id, venta.getId().getFechaHora(), produ,cantidad, produ.getPrecioVenta(), produ.getPrecioVenta()*cantidad,
                                                Double.parseDouble(textDescuentos.getText()));
            
            ventaDetalleRepo.save(ventaDetalle);
            poblarTabla();
        }
    }
    
    private void cargarCabecera(){
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
  
        textFecha.setText(df.format(venta.getId().getFechaHora()));
        textSucursal.setText(venta.getId().getSucursal().toString());
        textComputadora.setText(venta.getId().getComputadora().toString());
        textNotas.setText(venta.getNotas());
        
        if(venta.getCliente() != null){
            textCliente.setText(venta.getCliente().getId().toString());
            textClienteNombre.setText(venta.getCliente().getNombre().toString());
        }
        if(venta.getPago() != null){
            textPagoNumero.setText(venta.getPago().getId().toString());
            textPago.setText(venta.getPago().getNombre().toString());
        }
    }
    
    private void poblarTabla(){   
        //CABECERA TABLA
        Object[] columnNames = {"FECHA","SUCURSAL","COMPUTADORA","USUARIO","ORDEN","PRODUCTO","CANTIDAD","P. UNITARIO","P. TOTAL","DESC"};
        
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
//      getDetalleDeVenta(Date fecha, Sucursal sucursal, Computadora computadora, Usuario usuario) { 
        List<VentaDetalle> z = ventaDetalleRepo.getDetalleDeVenta(venta.getId());
        
        if(z != null){
            for (int i = 0; i < z.size(); i++) {
                if(z.get(i).getActivo()){
                    Object[] o = new Object[10];
                    o[0] = z.get(i).getId().getFechaHora().toString();
                    o[1] = z.get(i).getId().getSucursal().toString();
                    o[2] = z.get(i).getId().getComputadora().toString();
                    o[3] = z.get(i).getId().getUsuario().toString();
                    o[4] = z.get(i).getProducto().toString();
                    o[5] = z.get(i).getCantidad().toString();
                    o[6] = z.get(i).getPrecioUnitario().toString();
                    o[7] = z.get(i).getPrecioTotal().toString();
                    o[8] = z.get(i).getDescuento().toString();
                    model.addRow(o);
                }
            }
        }
        
        jTable1.setModel(model);
        repaint();
        revalidate();
    }
    
    public final void atajoTeclas(){
        InputMap map = this.getInputMap(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        //SALIR
	map.put(KeyStroke.getKeyStroke(title).getKeyStroke(KeyEvent.VK_ESCAPE, 0),"salir");
	this.getActionMap().put("salir", new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
    	});
        
        //clientes
        map.put(KeyStroke.getKeyStroke(title).getKeyStroke(KeyEvent.VK_F1, 0),"clientes");
	this.getActionMap().put("clientes", new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                ListaClientes x = new ListaClientes();
                x.setVisible(true);
                textCliente.setText(x.getSeleccionado());
                textClienteNombre.setText(x.getSeleccionadoNombre());
            }
    	});
        
        //pagos
        map.put(KeyStroke.getKeyStroke(title).getKeyStroke(KeyEvent.VK_F2, 0),"pagos");
	this.getActionMap().put("pagos", new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                ListaPagos x = new ListaPagos();
                x.setVisible(true);
                
                textPagoNumero.setText(x.getSeleccionado());
                textPago.setText(x.getSeleccionadoNombre());
            }
    	});
        
        //notas
        map.put(KeyStroke.getKeyStroke(title).getKeyStroke(KeyEvent.VK_F3, 0),"notas");
	this.getActionMap().put("notas", new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                textNotas.requestFocus();
            }
    	});
        
        //cierraTicketImprimiendo
        map.put(KeyStroke.getKeyStroke(title).getKeyStroke(KeyEvent.VK_F4, 0),"cierraTicketImprimiendo");
	this.getActionMap().put("cierraTicketImprimiendo", new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                botonCierraImprime.doClick();
            }
    	});
        
        //cierraTicket
        map.put(KeyStroke.getKeyStroke(title).getKeyStroke(KeyEvent.VK_F5, 0),"cierraTicket");
	this.getActionMap().put("cierraTicket", new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                botonCierraVenta.doClick();
            }
    	});
        
        //creaPresupuesto
        map.put(KeyStroke.getKeyStroke(title).getKeyStroke(KeyEvent.VK_F6, 0),"creaPresupuesto");
	this.getActionMap().put("creaPresupuesto", new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                botonPresupuesto.doClick();
            }
    	});
        
        //enviaACuentaCorrienteCliente
        map.put(KeyStroke.getKeyStroke(title).getKeyStroke(KeyEvent.VK_F7, 0),"enviaACuentaCorrienteCliente");
	this.getActionMap().put("enviaACuentaCorrienteCliente", new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                botonCuentaCorriente.doClick();
            }
    	});
        
        //eligeProductos
        map.put(KeyStroke.getKeyStroke(title).getKeyStroke(KeyEvent.VK_F8, 0),"eligeProductos");
	this.getActionMap().put("eligeProductos", new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                botonListaProductos.doClick();
            }
    	});
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonCierraImprime;
    public static javax.swing.JButton botonCierraVenta;
    public static javax.swing.JButton botonCuentaCorriente;
    public static javax.swing.JButton botonListaProductos;
    public static javax.swing.JButton botonPresupuesto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JFormattedTextField textCantidadProducto;
    private javax.swing.JFormattedTextField textCliente;
    private javax.swing.JTextField textClienteNombre;
    private javax.swing.JTextField textComputadora;
    private javax.swing.JTextField textDescuentoManual;
    private javax.swing.JTextField textDescuentoOfertas;
    private javax.swing.JTextField textDescuentoPagos;
    private javax.swing.JTextField textDescuentos;
    private javax.swing.JTextField textFecha;
    private javax.swing.JTextField textImpuestos;
    private javax.swing.JTextField textNotas;
    private javax.swing.JTextField textPago;
    private javax.swing.JFormattedTextField textPagoNumero;
    private javax.swing.JTextField textProducto;
    private javax.swing.JTextField textProductoNombre;
    private javax.swing.JTextField textSubtotal;
    private javax.swing.JTextField textSucursal;
    private javax.swing.JTextField textTotal;
    // End of variables declaration//GEN-END:variables
}
