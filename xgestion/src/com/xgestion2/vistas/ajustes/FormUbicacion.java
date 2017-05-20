/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.vistas.ajustes;

import com.xgestion2.entities.maestros.Ubicacion;
import com.xgestion2.repository.UbicacionRepository;
import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class FormUbicacion extends javax.swing.JDialog {

    /**
     * Creates new form FormUbicacion
     */
    private final Long id;
    private final UbicacionRepository y = new UbicacionRepository();
    private Ubicacion x = new Ubicacion();
    public FormUbicacion(java.awt.Frame parent, boolean modal,Long id) {
        super(parent, modal);
        this.id = id;
        
        initComponents();
        
        if(id>0)
            cargarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 600, 300));
        setMinimumSize(new java.awt.Dimension(514, 200));
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NOMBRE *:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 137, 37));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 137, 37));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 310, 37));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 310, 37));

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Guardar6.png"))); // NOI18N
        jButtonGuardar.setMnemonic('G');
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 50));

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Eliminar3.png"))); // NOI18N
        jButtonEliminar.setMnemonic('E');
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 150, 50));

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/ico35Cancelar5.png"))); // NOI18N
        jButtonCancelar.setMnemonic('C');
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 50));

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
                FormUbicaciones.jButtonBuscar.doClick();
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
       
//        if(jPasswordField1.getText().equals(jPasswordField2.getText())){
            
            x.setNombre(jTextField2.getText());
            
            if(!x.getNombre().isEmpty()){
                if(id>0)
                    y.update(x);
                else
                    y.save(x);

                dispose();
                FormUbicaciones.jButtonBuscar.doClick();
            }else{
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos obligatorios.");
            }
//        }else{
//            JOptionPane.showMessageDialog(null, "Los passwords deben coincidir.");
//        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void cargarValores(){
        x = y.get(this.id);
        jTextField1.setText(id.toString());
        jTextField2.setText(x.getNombre());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
