/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_proyecto_masivo;

import java.awt.Toolkit;

/**
 *
 * @author natha
 */
public class Consultar_tarjeta extends javax.swing.JFrame {

    /**
     * Creates new form Consultar_tarjeta
     */
    public Consultar_tarjeta() {
        initComponents();
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
        jLabel43 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        saldo_tarjeta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        estacion = new javax.swing.JTextField();
        modificar_tarjeta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        num_tarjeta = new javax.swing.JTextField();
        boton_buscar = new javax.swing.JButton();
        combo_estado = new javax.swing.JComboBox();
        eliminar_tarjeta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("CONSULTAR TARJETA");

        jLabel1.setText("No. de Tarjeta:");

        jLabel2.setText("Saldo:");

        saldo_tarjeta.setEnabled(false);
        saldo_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldo_tarjetaActionPerformed(evt);
            }
        });
        saldo_tarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                saldo_tarjetaKeyTyped(evt);
            }
        });

        jLabel4.setText("Estado:");

        estacion.setEditable(false);
        estacion.setEnabled(false);

        modificar_tarjeta.setText("Modificar Tarjeta");
        modificar_tarjeta.setEnabled(false);
        modificar_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_tarjetaActionPerformed(evt);
            }
        });

        jLabel5.setText("Estación de Compra:");

        num_tarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num_tarjetaKeyTyped(evt);
            }
        });

        boton_buscar.setText("Consultar Tarjeta");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activa", "Bloqueada" }));

        eliminar_tarjeta.setText("Eliminar Tarjeta");
        eliminar_tarjeta.setEnabled(false);
        eliminar_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_tarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boton_buscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saldo_tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(estacion)
                            .addComponent(num_tarjeta)
                            .addComponent(combo_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(126, Short.MAX_VALUE)
                        .addComponent(modificar_tarjeta)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar_tarjeta)))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_buscar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(saldo_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(estacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificar_tarjeta)
                    .addComponent(eliminar_tarjeta))
                .addGap(21, 21, 21))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/metrocali11.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saldo_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldo_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldo_tarjetaActionPerformed

    private void saldo_tarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldo_tarjetaKeyTyped
        // TODO add your handling code here:

        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_saldo_tarjetaKeyTyped

    private void modificar_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_tarjetaActionPerformed

    private void num_tarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num_tarjetaKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_num_tarjetaKeyTyped

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_buscarActionPerformed

    private void eliminar_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_tarjetaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_buscar;
    private javax.swing.JComboBox combo_estado;
    private javax.swing.JButton eliminar_tarjeta;
    private javax.swing.JTextField estacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificar_tarjeta;
    private javax.swing.JTextField num_tarjeta;
    private javax.swing.JTextField saldo_tarjeta;
    // End of variables declaration//GEN-END:variables
}
