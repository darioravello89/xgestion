/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.vistas.finanzas;

import com.xgestion2.vistas.ajustes.*;
import com.xgestion2.entities.maestros.Oferta;
import com.xgestion2.repository.OfertaRepository;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dario
 */
public class FormOfertas extends javax.swing.JInternalFrame {

    private String titulo;
    
    public FormOfertas() {
        this.titulo = "Ofertas";
        initComponents();
        atajoTeclas();
        poblarTabla("");
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
        jLabelEsquina = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        jLabelEsquina.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelEsquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/util/images/esquina.png"))); // NOI18N
        jLabelEsquina.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTextBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextBuscar.setToolTipText("Buscar");
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

        jButtonNuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonNuevo.setMnemonic('N');
        jButtonNuevo.setText("NUEVO");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText(this.titulo);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jLabelEsquina, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEsquina)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jLayeredPane1.setLayer(jLabelEsquina, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButtonBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButtonNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            int rowIndex = jTable1.getSelectedRow();
            String id = ""+jTable1.getModel().getValueAt(rowIndex, 0);
            
            FormOferta cm = new FormOferta(null,true,Long.valueOf(id));
            cm.setVisible(true);
            
            poblarTabla(jTextBuscar.getText());
	}
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        poblarTabla(jTextBuscar.getText());
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // TODO add your handling code here:
        FormOferta cm = new FormOferta(null,true,Long.valueOf(0));
        cm.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
         poblarTabla(jTextBuscar.getText());
    }//GEN-LAST:event_formFocusGained

    private void jTextBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyReleased
        // TODO add your handling code here:
        poblarTabla(jTextBuscar.getText());
    }//GEN-LAST:event_jTextBuscarKeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        
    }//GEN-LAST:event_formKeyReleased

    private void poblarTabla(String texto){
        OfertaRepository a = new OfertaRepository();
        List<Oferta> x = a.getAllActivos();
        
        //CABECERA TABLA
        Object[] columnNames = {"ID", "NOMBRE"};
        
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
        for (Oferta s : x) {
            if(s.getNombre().toUpperCase().contains(texto.toUpperCase()) ){
                Object[] o = new Object[2];
                o[0] = s.getId();
                o[1] = s.getNombre();
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEsquina;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextBuscar;
    // End of variables declaration//GEN-END:variables
}
