/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import BusinessModelLayer.Localidades;
import javax.swing.JOptionPane;

/**
 *
 * @author AJLJ-
 */
public class frmLocalidades extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmLocalidades
     */
    public frmLocalidades() {
        initComponents();
        tLocalidades.setModel(new Localidades().GetAllModel());
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
        jToolBar3 = new javax.swing.JToolBar();
        bAgregar2 = new javax.swing.JButton();
        bEliminar2 = new javax.swing.JButton();
        bActualizar2 = new javax.swing.JButton();
        bModificar2 = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tLocalidades = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Localidad");
        setVisible(true);

        jToolBar3.setRollover(true);

        bAgregar2.setText("Agregar");
        bAgregar2.setFocusable(false);
        bAgregar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAgregar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregar2ActionPerformed(evt);
            }
        });
        jToolBar3.add(bAgregar2);

        bEliminar2.setText("Eliminar");
        bEliminar2.setFocusable(false);
        bEliminar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEliminar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminar2ActionPerformed(evt);
            }
        });
        jToolBar3.add(bEliminar2);

        bActualizar2.setText("Actualizar");
        bActualizar2.setFocusable(false);
        bActualizar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bActualizar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(bActualizar2);

        bModificar2.setText("Modificar");
        bModificar2.setFocusable(false);
        bModificar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bModificar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificar2ActionPerformed(evt);
            }
        });
        jToolBar3.add(bModificar2);

        tLocalidades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tLocalidades);

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregar2ActionPerformed
        
        nLocalidades nl = new nLocalidades();
        nl.setTitle("Nueva Localidad");
        nl.setModal(true);
        nl.setVisible(true);
        tLocalidades.setModel(new Localidades().GetAllModel());
        
    }//GEN-LAST:event_bAgregar2ActionPerformed

    private void bEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminar2ActionPerformed
        if (tLocalidades.getSelectedRow() >= 0) {
            int idLocalidad = (int) tLocalidades.getValueAt(tLocalidades.getSelectedRow(), 0);
            Localidades obj = new Localidades();
            obj.setIdLocalidad(idLocalidad);
            obj.Delete();
            tLocalidades.setModel(new Localidades().GetAllModel());
        }else{
            JOptionPane.showMessageDialog(null, "Debes de seleccionar un registro");
        }
    }//GEN-LAST:event_bEliminar2ActionPerformed

    private void bModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificar2ActionPerformed
        if(tLocalidades.getSelectedRow()>= 0){
            int idLocalidad = (int) tLocalidades.getValueAt(tLocalidades.getSelectedRow(), 0);
            nLocalidades obj = new nLocalidades(idLocalidad);
            obj.setTitle("Modificar Localidad");
            obj.setModal(true);
            obj.setVisible(true);
            tLocalidades.setModel(new Localidades().GetAllModel());

        }else{
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar un registro");
        }
    }//GEN-LAST:event_bModificar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton bActualizar2;
    private javax.swing.JButton bAgregar2;
    private javax.swing.JButton bEliminar2;
    private javax.swing.JButton bModificar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JTable tLocalidades;
    // End of variables declaration//GEN-END:variables
}