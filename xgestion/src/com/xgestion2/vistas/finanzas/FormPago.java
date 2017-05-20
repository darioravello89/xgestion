/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.vistas.finanzas;

import com.xgestion2.vistas.ajustes.*;
import com.xgestion2.entities.maestros.Pago;
import com.xgestion2.entities.maestros.Proveedor;
import com.xgestion2.entities.maestros.Subfamilia;
import com.xgestion2.entities.maestros.UME;
import com.xgestion2.entities.maestros.Ubicacion;
import com.xgestion2.repository.PagoRepository;
import com.xgestion2.repository.SubfamiliaRepository;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.InternationalFormatter;

/**
 *
 * @author dario
 */
public class FormPago extends javax.swing.JDialog {

    /**
     * Creates new form FormPago
     */
    private final Long id;
    private final PagoRepository y = new PagoRepository();
    private Pago x = new Pago();
    
    public FormPago(java.awt.Frame parent, boolean modal,Long id) {
        super(parent, modal);
        this.id = id;
        
        initComponents();
        
        if(id>0)
            cargarValores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textDescuento = new javax.swing.JFormattedTextField();
        textId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 600, 400));
        setMinimumSize(new java.awt.Dimension(514, 200));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(490, 290));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("DESCUENTO *:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 137, 37));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 137, 37));

        textNombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        getContentPane().add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 310, 37));

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Guardar6.png"))); // NOI18N
        jButtonGuardar.setMnemonic('G');
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, 50));

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Eliminar3.png"))); // NOI18N
        jButtonEliminar.setMnemonic('E');
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 150, 50));

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Cancelar5.png"))); // NOI18N
        jButtonCancelar.setMnemonic('C');
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NOMBRE *:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 137, 37));

        textDescuento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textDescuento.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDescuentoKeyTyped(evt);
            }
        });
        getContentPane().add(textDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 310, 40));

        textId.setEditable(false);
        textId.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        getContentPane().add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 310, 37));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed
      
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        if(id>0){
            int reply = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este registro?", "Confirma Eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reply == JOptionPane.YES_OPTION) {
                x.setActivo(false);
                y.update(x);
                dispose();
                if(FormPagos.jButtonBuscar != null)
                    FormPagos.jButtonBuscar.doClick();
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
       
        if(!textNombre.getText().isEmpty() && !textDescuento.getText().isEmpty() ){

            x.setNombre(textNombre.getText());
            x.setDescuento(Integer.valueOf(textDescuento.getText()));

            if(id>0)
                y.update(x);
            else
                y.save(x);

            dispose();
            FormPagos.jButtonBuscar.doClick();
        }else{
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos obligatorios.");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void textDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDescuentoKeyTyped
        if ( textDescuento.getText().length()== 2)
            evt.consume();
       
    }//GEN-LAST:event_textDescuentoKeyTyped

    private void cargarValores(){

        x = y.get(this.id);
        textId.setText(id.toString());
        textNombre.setText(x.getNombre());
        textDescuento.setText(x.getDescuento().toString());
        
        repaint();
        revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFormattedTextField textDescuento;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
