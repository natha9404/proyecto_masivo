/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_proyecto_masivo;


//import logica.Bd_pqr;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Pqr extends javax.swing.JFrame {

    /**
     * Creates new form pqr
     */
    public Pqr() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        campo_pqr_nombre = new javax.swing.JTextField();
        campo_pqr_apellido = new javax.swing.JTextField();
        campo_pqr_cedula = new javax.swing.JTextField();
        campo_pqr_direccion = new javax.swing.JTextField();
        campo_pqr_telefono = new javax.swing.JTextField();
        campo_pqr_email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ComboBox_tipopqr = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_pqr = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo_sedes = new javax.swing.JComboBox();
        enviar_pqr = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA FLASH");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 215, 255), 3));

        jLabel8.setText("* Nombre:");

        jLabel9.setText("* Apellidos:");

        jLabel10.setText("* Cedula de Ciudadanía:");

        jLabel15.setText("* Dirección:");

        jLabel16.setText("* Teléfono:");

        jLabel17.setText("* Email:");

        campo_pqr_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_nombreActionPerformed(evt);
            }
        });

        campo_pqr_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_apellidoActionPerformed(evt);
            }
        });

        campo_pqr_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_cedulaActionPerformed(evt);
            }
        });
        campo_pqr_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_pqr_cedulaKeyTyped(evt);
            }
        });

        campo_pqr_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_direccionActionPerformed(evt);
            }
        });

        campo_pqr_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_telefonoActionPerformed(evt);
            }
        });
        campo_pqr_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_pqr_telefonoKeyTyped(evt);
            }
        });

        campo_pqr_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_emailActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de PQR:");

        ComboBox_tipopqr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Peticiones", "Queja", "Reclamo" }));
        ComboBox_tipopqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_tipopqrActionPerformed(evt);
            }
        });

        jLabel2.setText("Detalle del PQR:");

        texto_pqr.setColumns(20);
        texto_pqr.setRows(5);
        jScrollPane1.setViewportView(texto_pqr);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("DATOS PERSONALES (* Son obligatorios)");

        jLabel4.setText("Estación:");

        combo_sedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_sedesActionPerformed(evt);
            }
        });

        enviar_pqr.setText("Enviar");
        enviar_pqr.setEnabled(false);
        enviar_pqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_pqrActionPerformed(evt);
            }
        });

        jButton1.setText("Cargar Estación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/metrocali11.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBox_tipopqr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(enviar_pqr)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel17)
                                                    .addGap(100, 100, 100))
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel16)
                                                        .addComponent(jLabel15))
                                                    .addGap(23, 23, 23)))
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(campo_pqr_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                                .addComponent(campo_pqr_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(campo_pqr_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                                .addComponent(campo_pqr_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(campo_pqr_email, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campo_pqr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton1)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(combo_sedes, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboBox_tipopqr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel14))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_pqr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_pqr_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_pqr_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_pqr_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_pqr_telefono)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_pqr_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_sedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(enviar_pqr)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_pqr_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_nombreActionPerformed

    private void campo_pqr_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_apellidoActionPerformed

    private void campo_pqr_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_cedulaActionPerformed

    private void campo_pqr_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_direccionActionPerformed

    private void campo_pqr_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_telefonoActionPerformed

    private void campo_pqr_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_emailActionPerformed

    private void ComboBox_tipopqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_tipopqrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_tipopqrActionPerformed

    private void enviar_pqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_pqrActionPerformed
        // TODO add your handling code here:

        if ((texto_pqr.getText().trim().length() != 0) && (campo_pqr_nombre.getText().trim().length() != 0) && (campo_pqr_cedula.getText().trim().length() != 0) &&  (campo_pqr_apellido.getText().trim().length() != 0) &&  (campo_pqr_direccion.getText().trim().length() != 0) &&  (campo_pqr_telefono.getText().trim().length() != 0) &&  (campo_pqr_email.getText().trim().length() != 0) ) {
        
        String tipo_pqr = (String) ComboBox_tipopqr.getSelectedItem();
        String detalle = texto_pqr.getText();
        String nombre = campo_pqr_nombre.getText();
        String apellido = campo_pqr_apellido.getText();
        String cedula = campo_pqr_cedula.getText();
        String direccion = campo_pqr_direccion.getText();
        String telefono = campo_pqr_telefono.getText();
        String email = campo_pqr_email.getText();
        String sede = (String) combo_sedes.getSelectedItem();

       // Bd_pqr objeto_bd = new Bd_pqr();
       // objeto_bd.secuencia();
       // int n = objeto_bd.insertar_pqr(tipo_pqr, detalle, nombre, apellido, cedula, direccion, telefono, email, sede);
        this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Hay Campos Vacios");
        }
    }//GEN-LAST:event_enviar_pqrActionPerformed

    private void combo_sedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_sedesActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_combo_sedesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

       // Sedes buscar = new Sedes();
        ArrayList<String> listar_nombres = new ArrayList<>();
        //listar_nombres = buscar.obtener_sedes();

        String[] nombres = new String[listar_nombres.size()];

        for (int i = 0; i < listar_nombres.size(); i++) {

            nombres[i] = listar_nombres.get(i);
            System.out.println(nombres[i]);

        }
        combo_sedes.setModel(new javax.swing.DefaultComboBoxModel(nombres));

        enviar_pqr.setEnabled(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void campo_pqr_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_pqr_cedulaKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_pqr_cedulaKeyTyped

    private void campo_pqr_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_pqr_telefonoKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_pqr_telefonoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_tipopqr;
    private javax.swing.JTextField campo_pqr_apellido;
    private javax.swing.JTextField campo_pqr_cedula;
    private javax.swing.JTextField campo_pqr_direccion;
    private javax.swing.JTextField campo_pqr_email;
    private javax.swing.JTextField campo_pqr_nombre;
    private javax.swing.JTextField campo_pqr_telefono;
    private javax.swing.JComboBox combo_sedes;
    private javax.swing.JButton enviar_pqr;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto_pqr;
    // End of variables declaration//GEN-END:variables

    void rol(String rol_user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
