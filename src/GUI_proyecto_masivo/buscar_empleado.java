/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_proyecto_masivo;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class buscar_empleado extends javax.swing.JFrame {

    /**
     * Creates new form buscar_empleado
     */
    public buscar_empleado() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        campo_registro_nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campo_registro_cedula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ComboBox_registro_rol = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        campo_registro_direccion = new javax.swing.JTextField();
        campo_registro_telefono = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        boton_registrar_usuarios = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        buscar_empleado_modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Sistema de Transporte Masivo - Busqueda de Empleados");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI_proyecto_masivo/metrocali11.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        campo_registro_nombre.setEditable(false);
        campo_registro_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_nombreActionPerformed(evt);
            }
        });

        jLabel8.setText("* Nombre Completo:");

        campo_registro_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_cedulaActionPerformed(evt);
            }
        });
        campo_registro_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_registro_cedulaKeyTyped(evt);
            }
        });

        jLabel10.setText("Cedula de Ciudadanía:");

        ComboBox_registro_rol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Director de Estación", "Conductor", "Servicio al Cliente" }));

        jLabel13.setText(" Cargo:");

        campo_registro_direccion.setEditable(false);
        campo_registro_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_direccionActionPerformed(evt);
            }
        });

        campo_registro_telefono.setEditable(false);
        campo_registro_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_telefonoActionPerformed(evt);
            }
        });
        campo_registro_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_registro_telefonoKeyTyped(evt);
            }
        });

        jLabel15.setText(" Dirección:");

        jLabel16.setText(" Teléfono:");

        boton_registrar_usuarios.setText("Modificar");
        boton_registrar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar_usuariosActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("BUSCAR EMPLEADOS");

        buscar_empleado_modificar.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_registrar_usuarios)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(104, 104, 104))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscar_empleado_modificar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBox_registro_rol, 0, 194, Short.MAX_VALUE)
                            .addComponent(campo_registro_nombre)
                            .addComponent(campo_registro_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(campo_registro_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_registro_cedula))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campo_registro_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(buscar_empleado_modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campo_registro_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_registro_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_registro_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(campo_registro_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(boton_registrar_usuarios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_registro_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_nombreActionPerformed

    private void campo_registro_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_cedulaActionPerformed

    private void campo_registro_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_registro_cedulaKeyTyped
        // TODO add your handling code here:

        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_registro_cedulaKeyTyped

    private void campo_registro_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_direccionActionPerformed

    private void campo_registro_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_telefonoActionPerformed

    private void campo_registro_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_registro_telefonoKeyTyped
        // TODO add your handling code here:

        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_registro_telefonoKeyTyped

    private void boton_registrar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar_usuariosActionPerformed
        // TODO add your handling code here:

        //Verificar campos vaicos
         if ((campo_registro_nombre.getText().trim().length() != 0) && (campo_registro_cedula.getText().trim().length() != 0) && (campo_registro_direccion.getText().trim().length() != 0) && (campo_registro_telefono.getText().trim().length() != 0)) {

            /**
            * Se guarda en las variables cada uno de los campos de la ventana.
            */
            String cedula = campo_registro_cedula.getText();
            String nombre = campo_registro_nombre.getText();
            String cargo = (String) ComboBox_registro_rol.getSelectedItem();
            String direccion = campo_registro_direccion.getText();
            String telefono = campo_registro_telefono.getText();

            /**
            * Se realiza la conexion a la base de datos Y se hace el llamado a
            * registrar usuario con los campos llenos el cual devuelve un
            * entero donde si es 1, es porque el usuario se registro
            * correctamente de lo contrario el usuario ya existia y se le
            * informa al usuario
            */
         //   conexion_bd obj_conectarbd = new conexion_bd();

            int n=0;
            //int n = obj_conectarbd.registrar_usuario(cedula,  nombre, cargo, direccion, telefono);

            if (n == 1) {
                this.dispose();
            } else {

                campo_registro_cedula.setText("");
                campo_registro_nombre.setText("");
                campo_registro_direccion.setText("");
                campo_registro_telefono.setText("");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Hay campos vacios, por favor completelos");
        }
    }//GEN-LAST:event_boton_registrar_usuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(buscar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscar_empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_registro_rol;
    private javax.swing.JToggleButton boton_registrar_usuarios;
    private javax.swing.JButton buscar_empleado_modificar;
    private javax.swing.JTextField campo_registro_cedula;
    private javax.swing.JTextField campo_registro_direccion;
    private javax.swing.JTextField campo_registro_nombre;
    private javax.swing.JTextField campo_registro_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
