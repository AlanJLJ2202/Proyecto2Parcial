
package ViewLayer;

import DataAccessLayer.ConexionSQL;


public class frmMain extends javax.swing.JFrame {

    
    public frmMain() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        desktopPane = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        mnArchivo = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();
        mnCatalogos = new javax.swing.JMenu();
        btnProductos = new javax.swing.JMenuItem();
        bUsuarios = new javax.swing.JMenuItem();
        bSucursales = new javax.swing.JMenuItem();
        bCategoria = new javax.swing.JMenuItem();
        bContacto = new javax.swing.JMenuItem();
        bClientes = new javax.swing.JMenuItem();
        bLocalidades = new javax.swing.JMenuItem();
        bEstados = new javax.swing.JMenuItem();
        bMunicipios = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        mnArchivo.setText("Archivo");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        mnArchivo.add(btnSalir);

        jMenuBar3.add(mnArchivo);

        mnCatalogos.setText("Catalogos");
        mnCatalogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCatalogosActionPerformed(evt);
            }
        });

        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnProductos);

        bUsuarios.setText("Usuarios");
        bUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuariosActionPerformed(evt);
            }
        });
        mnCatalogos.add(bUsuarios);

        bSucursales.setText("Sucursales");
        bSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSucursalesActionPerformed(evt);
            }
        });
        mnCatalogos.add(bSucursales);

        bCategoria.setText("Categoria");
        bCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCategoriaActionPerformed(evt);
            }
        });
        mnCatalogos.add(bCategoria);

        bContacto.setText("Contacto");
        bContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bContactoActionPerformed(evt);
            }
        });
        mnCatalogos.add(bContacto);

        bClientes.setText("Clientes");
        bClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClientesActionPerformed(evt);
            }
        });
        mnCatalogos.add(bClientes);

        bLocalidades.setText("Localidades");
        bLocalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLocalidadesActionPerformed(evt);
            }
        });
        mnCatalogos.add(bLocalidades);

        bEstados.setText("Estados");
        bEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEstadosActionPerformed(evt);
            }
        });
        mnCatalogos.add(bEstados);

        bMunicipios.setText("Municipios");
        bMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMunicipiosActionPerformed(evt);
            }
        });
        mnCatalogos.add(bMunicipios);

        jMenuItem1.setText("Proveedores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnCatalogos.add(jMenuItem1);

        jMenuBar3.add(mnCatalogos);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void mnCatalogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCatalogosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnCatalogosActionPerformed

    private void bSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSucursalesActionPerformed
        frmSucursales fs = new frmSucursales();
        desktopPane.add(fs);
    }//GEN-LAST:event_bSucursalesActionPerformed

    private void bUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuariosActionPerformed
        frmUsuarios fu = new frmUsuarios();
        desktopPane.add(fu);
    }//GEN-LAST:event_bUsuariosActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
        frmProductos obj = new frmProductos();
        desktopPane.add(obj);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void bCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCategoriaActionPerformed
        frmCategoria fc = new frmCategoria();
        desktopPane.add(fc);       
    }//GEN-LAST:event_bCategoriaActionPerformed

    private void bContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bContactoActionPerformed
       frmContactos fcc = new frmContactos();
       desktopPane.add(fcc);
    }//GEN-LAST:event_bContactoActionPerformed

    private void bClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClientesActionPerformed
        frmClientes fccc = new frmClientes();
        desktopPane.add(fccc);
    }//GEN-LAST:event_bClientesActionPerformed

    private void bLocalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLocalidadesActionPerformed
       frmLocalidades fl = new frmLocalidades();
       desktopPane.add(fl);
       
    }//GEN-LAST:event_bLocalidadesActionPerformed

    private void bEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEstadosActionPerformed
       frmEstados fe = new frmEstados();
       desktopPane.add(fe);
    }//GEN-LAST:event_bEstadosActionPerformed

    private void bMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMunicipiosActionPerformed
      frmMunicipio fm = new frmMunicipio();
      desktopPane.add(fm);
    }//GEN-LAST:event_bMunicipiosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmProveedores fp = new frmProveedores();
      desktopPane.add(fp);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bCategoria;
    private javax.swing.JMenuItem bClientes;
    private javax.swing.JMenuItem bContacto;
    private javax.swing.JMenuItem bEstados;
    private javax.swing.JMenuItem bLocalidades;
    private javax.swing.JMenuItem bMunicipios;
    private javax.swing.JMenuItem bSucursales;
    private javax.swing.JMenuItem bUsuarios;
    private javax.swing.JMenuItem btnProductos;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnArchivo;
    private javax.swing.JMenu mnCatalogos;
    // End of variables declaration//GEN-END:variables
}
