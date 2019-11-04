/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.CardLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author Hp Pc
 */
public final class frm_menu_proveedores extends javax.swing.JFrame {

    /**
     * Creates new form frm_menu_usuario
     */
    pnl_alta_proveedores pnl_alta_proveedores = new pnl_alta_proveedores();
    pnl_eliminacion_proveedores pnl_baja_proveedores = new pnl_eliminacion_proveedores();
    pnl_modificacion_proveedores pnl_modificacion_proveedores = new pnl_modificacion_proveedores();
    pnl_busqueda_proveedores pnl_busqueda_proveedores =new pnl_busqueda_proveedores();
    pnl_listado_proveedores pnl_listado_proveedores = new pnl_listado_proveedores();
    CardLayout vista;
    

    public frm_menu_proveedores() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        iconoFormulario();
        vista = (CardLayout) pnl_vista_principal.getLayout();
    }

    public void iconoFormulario() {
        URL url = getClass().getResource("/imagenes/iconoDelSistema.png");
        ImageIcon iconFormulario = new ImageIcon(url);
        setIconImage(iconFormulario.getImage());
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_bajaU = new javax.swing.JToggleButton();
        btn_modificacionU = new javax.swing.JToggleButton();
        btn_consultaU = new javax.swing.JToggleButton();
        btn_altaU = new javax.swing.JToggleButton();
        btn_listadoU = new javax.swing.JToggleButton();
        btn_salirU = new javax.swing.JButton();
        pnl_vista_principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de usuarios");

        jPanel1.setBackground(new java.awt.Color(204, 0, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Menu del sistema");

        btn_bajaU.setBackground(new java.awt.Color(204, 204, 204));
        btn_bajaU.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_bajaU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminacionUsuario.png"))); // NOI18N
        btn_bajaU.setText("Eliminar proveedor");
        btn_bajaU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_bajaU.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_bajaU.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_bajaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bajaUActionPerformed(evt);
            }
        });

        btn_modificacionU.setBackground(new java.awt.Color(204, 204, 204));
        btn_modificacionU.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_modificacionU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificacionUsuario.png"))); // NOI18N
        btn_modificacionU.setText("Modificar datos de un proveedor");
        btn_modificacionU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_modificacionU.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_modificacionU.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_modificacionU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificacionUActionPerformed(evt);
            }
        });

        btn_consultaU.setBackground(new java.awt.Color(204, 204, 204));
        btn_consultaU.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_consultaU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        btn_consultaU.setText("Buscar un proveedor");
        btn_consultaU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_consultaU.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_consultaU.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_consultaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaUActionPerformed(evt);
            }
        });

        btn_altaU.setBackground(new java.awt.Color(204, 204, 204));
        btn_altaU.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_altaU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altaUsuario.png"))); // NOI18N
        btn_altaU.setSelected(true);
        btn_altaU.setText("Registro de un nuevo proveedor");
        btn_altaU.setToolTipText("");
        btn_altaU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_altaU.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_altaU.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_altaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altaUActionPerformed(evt);
            }
        });

        btn_listadoU.setBackground(new java.awt.Color(204, 204, 204));
        btn_listadoU.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_listadoU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listadoUsuario.png"))); // NOI18N
        btn_listadoU.setText("Ver listado de proveedor");
        btn_listadoU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_listadoU.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_listadoU.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_listadoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listadoUActionPerformed(evt);
            }
        });

        btn_salirU.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_salirU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btn_salirU.setText("Salir");
        btn_salirU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salirU.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_salirU.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_salirU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_listadoU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_bajaU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_modificacionU, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(btn_consultaU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_altaU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btn_salirU)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(btn_altaU, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_modificacionU, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_bajaU, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_consultaU, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_listadoU, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_salirU)
                .addContainerGap())
        );

        pnl_vista_principal.setBackground(new java.awt.Color(204, 0, 153));
        pnl_vista_principal.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_vista_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_vista_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 696, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bajaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bajaUActionPerformed
       pnl_vista_principal.add(pnl_baja_proveedores,"Baja");
        vista.show(pnl_vista_principal, "Baja");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btn_bajaUActionPerformed

    private void btn_modificacionUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificacionUActionPerformed
        pnl_vista_principal.add(pnl_modificacion_proveedores,"Modificacion");
        vista.show(pnl_vista_principal, "Modificacaion");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btn_modificacionUActionPerformed

    private void btn_consultaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaUActionPerformed
        pnl_vista_principal.add(pnl_busqueda_proveedores,"Busqueda");
        vista.show(pnl_vista_principal, "Busqueda");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btn_consultaUActionPerformed

    private void btn_altaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altaUActionPerformed
        pnl_vista_principal.add(pnl_alta_proveedores, "alta");
        vista.show(pnl_vista_principal, "alta");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btn_altaUActionPerformed

    private void btn_listadoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listadoUActionPerformed
        pnl_vista_principal.add(pnl_listado_proveedores,"Listado");
        vista.show(pnl_vista_principal, "Listado");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_btn_listadoUActionPerformed

    private void btn_salirUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirUActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirUActionPerformed

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
            java.util.logging.Logger.getLogger(frm_menu_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_menu_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_menu_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_menu_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_menu_proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_altaU;
    private javax.swing.JToggleButton btn_bajaU;
    private javax.swing.JToggleButton btn_consultaU;
    private javax.swing.JToggleButton btn_listadoU;
    private javax.swing.JToggleButton btn_modificacionU;
    private javax.swing.JButton btn_salirU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnl_vista_principal;
    // End of variables declaration//GEN-END:variables
}
