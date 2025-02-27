/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.ufes.crud.view;

import br.ufes.crud.presenter.IncluirPresenter;
import br.ufes.crud.presenter.ListarPresenter;
import br.ufes.crud.presenter.VisualizarUsuarioPresenter;

import javax.swing.*;

/**
 * @author pedro lucas
 */
public class PrincipalView extends javax.swing.JFrame {

    public PrincipalView() {
        initComponents();

        this.setLocationRelativeTo(this.getParent());
        this.setExtendedState(MAXIMIZED_BOTH);

        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cbBuscar = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNovo.setText("Novo");
        btnNovo.setToolTipText("");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Nome", "Telefone"}));

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {},
                        {},
                        {},
                        {}
                },
                new String[]{

                }
        ));
        jScrollPane2.setViewportView(tbUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBuscar)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVisualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFechar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar)
                                        .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnNovo)
                                        .addComponent(btnVisualizar)
                                        .addComponent(btnFechar))
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnVisualizar.getAccessibleContext().setAccessibleDescription("");
        cbBuscar.getAccessibleContext().setAccessibleName("cbBuscar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        IncluirPresenter presenter = new IncluirPresenter();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        VisualizarUsuarioPresenter presenter = new VisualizarUsuarioPresenter();
    }//GEN-LAST:event_btnVisualizarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JComboBox<String> cbBuscar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnVisualizar() {
        return btnVisualizar;
    }

    public void setBtnVisualizar(JButton btnVisualizar) {
        this.btnVisualizar = btnVisualizar;
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }

    public void setBtnFechar(JButton btnFechar) {
        this.btnFechar = btnFechar;
    }

    public JButton getBtnNovo() {
        return btnNovo;
    }

    public void setBtnNovo(JButton btnNovo) {
        this.btnNovo = btnNovo;
    }

    public JComboBox<String> getCbBuscar() {
        return cbBuscar;
    }

    public void setCbBuscar(JComboBox<String> cbBuscar) {
        this.cbBuscar = cbBuscar;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTable getTbUsuarios() {
        return tbUsuarios;
    }

    public void setTbUsuarios(JTable tbUsuarios) {
        this.tbUsuarios = tbUsuarios;
    }

    public void initView(ListarPresenter listarPresenter) {
        listarPresenter.listarUsuarios();
    }

}
