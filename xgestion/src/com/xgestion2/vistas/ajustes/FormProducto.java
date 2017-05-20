/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.vistas.ajustes;

import com.xgestion2.entities.maestros.Familia;
import com.xgestion2.entities.maestros.Producto;
import com.xgestion2.entities.maestros.Proveedor;
import com.xgestion2.entities.maestros.Subfamilia;
import com.xgestion2.entities.maestros.UME;
import com.xgestion2.entities.maestros.Ubicacion;
import com.xgestion2.repository.FamiliaRepository;
import com.xgestion2.repository.ProductoRepository;
import com.xgestion2.repository.ProveedorRepository;
import com.xgestion2.repository.SubfamiliaRepository;
import com.xgestion2.repository.UMERepository;
import com.xgestion2.repository.UbicacionRepository;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;
import xgestion.FormPrincipal;

/**
 *
 * @author dario
 */
public class FormProducto extends javax.swing.JDialog {

    /**
     * Creates new form FormProducto
     */
    private final Long id;
    private final ProductoRepository y = new ProductoRepository();
    private Producto x = new Producto();
    private final UMERepository umeRepo = new UMERepository();
    private final ProveedorRepository proveedorRepo = new ProveedorRepository();
    private final UbicacionRepository ubicacionRepo = new UbicacionRepository();
    private final FamiliaRepository familiaRepo = new FamiliaRepository();
    private final SubfamiliaRepository subfamiliaRepo = new SubfamiliaRepository();
    
    public FormProducto(java.awt.Frame parent, boolean modal,Long id) {
        super(parent, modal);
        this.id = id;
        
        initComponents();
        pueblaComboBoxes();
        
        if(id>0)
            cargarValores();
        
        dependenciaComboFamilia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textId = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textDescripcion = new javax.swing.JTextField();
        textoCodigoBarra = new javax.swing.JTextField();
        textoCodigoInterno = new javax.swing.JTextField();
        textCodigoProveedor = new javax.swing.JTextField();
        comboUME = new javax.swing.JComboBox();
        comboFamilia = new javax.swing.JComboBox();
        comboSubfamilia = new javax.swing.JComboBox();
        comboUbicacion = new javax.swing.JComboBox();
        comboProveedor = new javax.swing.JComboBox();
        textoPrecioVenta = new javax.swing.JFormattedTextField();
        textoPrecioCosto = new javax.swing.JFormattedTextField();
        textoGanancia = new javax.swing.JFormattedTextField();
        textoStockInicial = new javax.swing.JFormattedTextField();
        textoPrecioCosto2 = new javax.swing.JFormattedTextField();
        textoGanancia2 = new javax.swing.JFormattedTextField();
        textoPrecioVenta2 = new javax.swing.JFormattedTextField();
        checkPrecioManual = new javax.swing.JCheckBox();
        checkStockeable = new javax.swing.JCheckBox();
        checkContabilizable = new javax.swing.JCheckBox();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 600, 300));
        setMinimumSize(new java.awt.Dimension(514, 420));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(1046, 640));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textId.setEditable(false);
        textId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 310, 37));

        textNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 310, 37));

        textDescripcion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(textDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 310, 37));

        textoCodigoBarra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(textoCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 310, 37));

        textoCodigoInterno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(textoCodigoInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 310, 37));

        textCodigoProveedor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(textCodigoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 310, 37));

        comboUME.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(comboUME, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 320, 40));

        comboFamilia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(comboFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 320, 40));

        comboSubfamilia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(comboSubfamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 320, 40));

        comboUbicacion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(comboUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 320, 40));

        comboProveedor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(comboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 320, 40));

        textoPrecioVenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        textoPrecioVenta.setText("0");
        textoPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoPrecioVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textoPrecioVentaFocusLost(evt);
            }
        });
        getContentPane().add(textoPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 150, 40));

        textoPrecioCosto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        textoPrecioCosto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoPrecioCosto.setText("0");
        textoPrecioCosto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoPrecioCosto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textoPrecioCostoFocusLost(evt);
            }
        });
        getContentPane().add(textoPrecioCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 150, 40));

        textoGanancia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textoGanancia.setText("0");
        textoGanancia.setToolTipText("");
        textoGanancia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoGanancia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textoGananciaFocusLost(evt);
            }
        });
        textoGanancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoGananciaKeyTyped(evt);
            }
        });
        getContentPane().add(textoGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 150, 40));

        textoStockInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        textoStockInicial.setToolTipText("");
        textoStockInicial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(textoStockInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 320, 40));

        textoPrecioCosto2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        textoPrecioCosto2.setText("0");
        textoPrecioCosto2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoPrecioCosto2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textoPrecioCosto2FocusLost(evt);
            }
        });
        getContentPane().add(textoPrecioCosto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 150, 40));

        textoGanancia2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textoGanancia2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoGanancia2.setText("0");
        textoGanancia2.setToolTipText("");
        textoGanancia2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoGanancia2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textoGanancia2FocusLost(evt);
            }
        });
        textoGanancia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoGanancia2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoGanancia2KeyTyped(evt);
            }
        });
        getContentPane().add(textoGanancia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 150, 40));

        textoPrecioVenta2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        textoPrecioVenta2.setText("0");
        textoPrecioVenta2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textoPrecioVenta2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textoPrecioVenta2FocusLost(evt);
            }
        });
        getContentPane().add(textoPrecioVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 150, 40));

        checkPrecioManual.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        checkPrecioManual.setMnemonic('P');
        checkPrecioManual.setText("Imputa Precio Manual? (En Venta)");
        checkPrecioManual.setToolTipText("");
        getContentPane().add(checkPrecioManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 280, 40));

        checkStockeable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        checkStockeable.setMnemonic('T');
        checkStockeable.setSelected(true);
        checkStockeable.setText("Es Stockeable? (Descuenta Stock)");
        getContentPane().add(checkStockeable, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 280, 40));

        checkContabilizable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        checkContabilizable.setMnemonic('O');
        checkContabilizable.setSelected(true);
        checkContabilizable.setText("Es Contabilizable? (Libro Diario)");
        getContentPane().add(checkContabilizable, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 280, 40));

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Guardar6.png"))); // NOI18N
        jButtonGuardar.setMnemonic('G');
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 150, 50));

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Eliminar3.png"))); // NOI18N
        jButtonEliminar.setMnemonic('E');
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 530, 150, 50));

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Cancelar5.png"))); // NOI18N
        jButtonCancelar.setMnemonic('C');
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 160, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NOMBRE *:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 137, 37));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("PRECIO VTA *:");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 160, 37));
        jLabel4.getAccessibleContext().setAccessibleName("PRECIO COSTO *:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 137, 37));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DESCRIPCION *:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 137, 37));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("COD BARRA *:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 137, 37));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("COD INTERNO *:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 37));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("COD PROVEDOR *:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, 37));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("PRECIO COSTO *:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, 37));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("GANANCIA % *:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 160, 37));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("PRECIO COSTO 2 *:");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 170, 37));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("GANANCIA 2 % *:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 160, 37));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("PRECIO VTA 2 *:");
        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 160, 37));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("U. MEDIDA *:");
        jLabel13.setToolTipText("");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 160, 37));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("FAMILIA *:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 160, 37));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("SUBFAMILIA *:");
        jLabel15.setToolTipText("");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 160, 37));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("STOCK INICIAL *:");
        jLabel16.setToolTipText("");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 160, 37));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("UBICACION *:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 160, 37));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("PROVEEDOR *:");
        jLabel18.setToolTipText("");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 160, 37));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        
        if(id>0){
            int reply = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este registro?", "Confirma Eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reply == JOptionPane.YES_OPTION) {
                x.setActivo(false);
                y.update(x);
                dispose();
                FormProductos.jButtonBuscar.doClick();
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    public void pueblaComboBoxes(){
        List<Familia> familias = familiaRepo.getAllActivos();
        comboFamilia.removeAllItems();
        
        for (Familia a : familias) {
            comboFamilia.addItem(a.getId()+"-"+a.getNombre());
        }
        
        List<Subfamilia> subfamilias = subfamiliaRepo.getAllActivos();
        comboSubfamilia.removeAllItems();
        
        for (Subfamilia b : subfamilias) {
            comboSubfamilia.addItem(b.getId()+"-"+b.getNombre());
        }
        
        List<UME> umes = umeRepo.getAllActivos();
        comboUME.removeAllItems();
        
        for (UME c : umes) {
            comboUME.addItem(c.getId()+"-"+c.getNombre());
        }
        
        List<Ubicacion> ubicaciones = ubicacionRepo.getAllActivos();
        comboUbicacion.removeAllItems();
        
        for (Ubicacion d : ubicaciones) {
            comboUbicacion.addItem(d.getId()+"-"+d.getNombre());
        }
        
        List<Proveedor> proveedores = proveedorRepo.getAllActivos();
        comboProveedor.removeAllItems();
        
        for (Proveedor e : proveedores) {
            comboProveedor.addItem(e.getId()+"-"+e.getNombre());
        }

        repaint();
        revalidate();
    }
    
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
       
//        if(jPasswordField1.getText().equals(jPasswordField2.getText()))

            if(!textNombre.getText().isEmpty() && !textDescripcion.getText().isEmpty() && !textoCodigoBarra.getText().isEmpty() && !textoCodigoInterno.getText().isEmpty() 
                    && !textCodigoProveedor.getText().isEmpty() && !comboUME.getSelectedItem().toString().isEmpty()   && !comboFamilia.getSelectedItem().toString().isEmpty() 
                    && !comboSubfamilia.getSelectedItem().toString().isEmpty() && !comboProveedor.getSelectedItem().toString().isEmpty() && !comboUbicacion.getSelectedItem().toString().isEmpty()){
                
                String[] ume        = comboUME.getSelectedItem().toString().split("-");
                String[] familia    = comboFamilia.getSelectedItem().toString().split("-");
                String[] subfamilia = comboSubfamilia.getSelectedItem().toString().split("-");
                String[] ubicacion  = comboUbicacion.getSelectedItem().toString().split("-");
                String[] proveedor  = comboProveedor.getSelectedItem().toString().split("-");

                x.setNombre(textNombre.getText());
                x.setDescripcion(textDescripcion.getText());
                x.setCodigoBarras(textoCodigoBarra.getText());
                x.setCodigoInterno(textoCodigoInterno.getText());
                x.setCodigoProveedor(textCodigoProveedor.getText());
                x.setStockeable(checkStockeable.isSelected());
                x.setContabilizable(checkContabilizable.isSelected());
                x.setPrecioManual(checkPrecioManual.isSelected());
                x.setPrecioCosto(Double.valueOf(textoPrecioCosto.getText().replaceAll(",", ".")));
                x.setGanancia(Integer.valueOf(textoGanancia.getText()));
                x.setPrecioVenta(Double.valueOf(textoPrecioVenta.getText().replaceAll(",", ".")));
                x.setPrecioCosto2(Double.valueOf(textoPrecioCosto2.getText().replaceAll(",", ".")));
                x.setGanancia2(Integer.valueOf(textoGanancia2.getText()));
                x.setPrecioVenta2(Double.valueOf(textoPrecioVenta2.getText().replaceAll(",", ".")));   
                x.setModificado(new java.util.Date());
                
                x.setUme(umeRepo.get(Long.valueOf(ume[0])));
                x.setFamilia(familiaRepo.get(Long.valueOf(familia[0])));
                x.setSubfamilia(subfamiliaRepo.get(Long.valueOf(subfamilia[0])));
                x.setUbicacion(ubicacionRepo.get(Long.valueOf(ubicacion[0])));
                x.setProveedor(proveedorRepo.get(Long.valueOf(proveedor[0])));   

                if(id>0)
                    y.update(x);
                else
                    y.save(x);

                dispose();
                FormProductos.jButtonBuscar.doClick();
            }else{
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos obligatorios (*).");
            }
//        }else{
//            JOptionPane.showMessageDialog(null, "Los passwords deben coincidir.");
//        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void textoPrecioCostoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoPrecioCostoFocusLost
        // TODO add your handling code here:
        calculaPrecio();
    }//GEN-LAST:event_textoPrecioCostoFocusLost

    private void textoGananciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoGananciaFocusLost
        // TODO add your handling code here:
        calculaPrecio();
    }//GEN-LAST:event_textoGananciaFocusLost

    private void textoPrecioVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoPrecioVentaFocusLost
        // TODO add your handling code here:
        calculaPrecio();
    }//GEN-LAST:event_textoPrecioVentaFocusLost

    private void textoPrecioCosto2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoPrecioCosto2FocusLost
        // TODO add your handling code here:
        calculaPrecio();
    }//GEN-LAST:event_textoPrecioCosto2FocusLost

    private void textoGanancia2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoGanancia2FocusLost
        // TODO add your handling code here:
        calculaPrecio();
    }//GEN-LAST:event_textoGanancia2FocusLost

    private void textoPrecioVenta2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoPrecioVenta2FocusLost
        // TODO add your handling code here:
        calculaPrecio();
    }//GEN-LAST:event_textoPrecioVenta2FocusLost

    private void textoGananciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoGananciaKeyTyped
         if ( textoGanancia.getText().length()== 3)
            evt.consume();
    }//GEN-LAST:event_textoGananciaKeyTyped

    private void textoGanancia2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoGanancia2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoGanancia2KeyPressed

    private void textoGanancia2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoGanancia2KeyTyped
        if ( textoGanancia2.getText().length()== 3)
            evt.consume();
    }//GEN-LAST:event_textoGanancia2KeyTyped

    private void cargarValores(){
        x = y.get(this.id);
        textId.setText(id.toString());
        textNombre.setText(x.getNombre());
        textDescripcion.setText(x.getDescripcion());
        textoCodigoBarra.setText(x.getCodigoBarras());
        textoCodigoInterno.setText(x.getCodigoInterno());
        textCodigoProveedor.setText(x.getCodigoProveedor());
        checkStockeable.setSelected(x.getStockeable());
        checkContabilizable.setSelected(x.getContabilizable());
        checkPrecioManual.setSelected(x.getPrecioManual());
        textoPrecioCosto.setText(x.getPrecioCosto().toString());
        textoGanancia.setText(x.getGanancia().toString());
        textoPrecioVenta.setText(x.getPrecioVenta().toString());
        textoPrecioCosto2.setText(x.getPrecioCosto2().toString());
        textoGanancia2.setText(x.getGanancia2().toString());
        textoPrecioVenta2.setText(x.getPrecioVenta2().toString());
       
        comboUME.setSelectedItem(x.getUme().getId()+"-"+x.getUme().getNombre());
        comboFamilia.setSelectedItem(x.getFamilia().getId()+"-"+x.getFamilia().getNombre());
        comboSubfamilia.setSelectedItem(x.getSubfamilia().getId()+"-"+x.getSubfamilia().getNombre());
        comboUbicacion.setSelectedItem(x.getUbicacion().getId()+"-"+x.getUbicacion().getNombre());
        comboProveedor.setSelectedItem(x.getProveedor().getId()+"-"+x.getProveedor().getNombre());
        
        textoStockInicial.setEnabled(false);
        
        revalidate();
        repaint();
    }
    
    public void calculaPrecio(){

        if(Double.valueOf(textoGanancia.getText())!= 0){
            
            //CALCULA GANANCIA 
            String ganancia1 = textoGanancia.getText();
            if(ganancia1.length() > 2)
                ganancia1 = (Integer.valueOf(ganancia1.substring(0, ganancia1.length()-2))+1)+"."+ganancia1.substring(ganancia1.length()-2,ganancia1.length());
            else if (ganancia1.length() == 2)
                ganancia1 = "1."+ganancia1.substring(ganancia1.length()-2,ganancia1.length());
            else if (ganancia1.length() == 1)
                ganancia1 = "1.0"+ganancia1;
            else
                ganancia1 = "0";
//            System.out.println(ganancia1);

            Double precioVta1 = Math.ceil(Double.valueOf(textoPrecioCosto.getText().replaceAll(",", "."))*Double.valueOf(ganancia1)*Integer.valueOf(FormPrincipal.prop.getProperty("redondeo")));
            precioVta1 = precioVta1 / Integer.valueOf(FormPrincipal.prop.getProperty("redondeo"));
            
            textoPrecioVenta.setText(precioVta1.toString());
        }
        
        if(Double.valueOf(textoGanancia2.getText())!= 0){
            
            //CALCULA GANANCIA 
            String ganancia2 = textoGanancia2.getText();
            if(ganancia2.length() > 2)
                ganancia2 = (Integer.valueOf(ganancia2.substring(0, ganancia2.length()-2))+1)+"."+ganancia2.substring(ganancia2.length()-2,ganancia2.length());
            else if (ganancia2.length() == 2)
                ganancia2 = "1."+ganancia2.substring(ganancia2.length()-2,ganancia2.length());
            else if (ganancia2.length() == 1)
                ganancia2 = "1.0"+ganancia2;
            else
                ganancia2 = "0";
            
//            System.out.println(ganancia2);
             
            Double precioVta2 = Math.ceil(Double.valueOf(textoPrecioCosto2.getText().replaceAll(",", "."))*Double.valueOf(ganancia2)*Integer.valueOf(FormPrincipal.prop.getProperty("redondeo")));
            precioVta2 = precioVta2 / Integer.valueOf(FormPrincipal.prop.getProperty("redondeo"));
            
            textoPrecioVenta2.setText(precioVta2.toString());
        }
        
        repaint();
        revalidate();
    }

     private void dependenciaComboFamilia() {
        this.comboFamilia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                
                String[] familia3    = comboFamilia.getSelectedItem().toString().split("-");
                List<Subfamilia> subfamilias=null;
                
                if(!Objects.equals(Long.valueOf(familia3[0]), Long.valueOf("0")))
                    subfamilias = subfamiliaRepo.getAllByFamilia(Long.valueOf(familia3[0]));
                else
                    subfamilias = subfamiliaRepo.getAll();
                
                comboSubfamilia.removeAllItems();
                for (Subfamilia b : subfamilias) {
                    comboSubfamilia.addItem(b.getId()+"-"+b.getNombre());
                }
                
                repaint();
                revalidate();
            }
        });
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkContabilizable;
    private javax.swing.JCheckBox checkPrecioManual;
    private javax.swing.JCheckBox checkStockeable;
    private javax.swing.JComboBox comboFamilia;
    private javax.swing.JComboBox comboProveedor;
    private javax.swing.JComboBox comboSubfamilia;
    private javax.swing.JComboBox comboUME;
    private javax.swing.JComboBox comboUbicacion;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField textCodigoProveedor;
    private javax.swing.JTextField textDescripcion;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textoCodigoBarra;
    private javax.swing.JTextField textoCodigoInterno;
    private javax.swing.JFormattedTextField textoGanancia;
    private javax.swing.JFormattedTextField textoGanancia2;
    private javax.swing.JFormattedTextField textoPrecioCosto;
    private javax.swing.JFormattedTextField textoPrecioCosto2;
    private javax.swing.JFormattedTextField textoPrecioVenta;
    private javax.swing.JFormattedTextField textoPrecioVenta2;
    private javax.swing.JFormattedTextField textoStockInicial;
    // End of variables declaration//GEN-END:variables
}
