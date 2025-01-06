/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufes.crud.presenter;

import br.ufes.crud.dao.UsuarioDao;
import br.ufes.crud.dao.UsuarioDaoImpl;
import br.ufes.crud.view.VisualizarUsuarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pedro lucas
 */
public class VisualizarUsuarioPresenter {

    private final VisualizarUsuarioView view;
    private UsuarioDao usuarioDao;

    public VisualizarUsuarioPresenter() {
        view = new VisualizarUsuarioView();
        usuarioDao = new UsuarioDaoImpl();

        view.getBtnExcluir().addActionListener((ActionEvent e) -> {
            System.out.println(e.getID());
            excluir(1);
        });
        
        view.setVisible(true);
    }

    private void excluir(Integer id) {
            usuarioDao.deletar(id);
    }

}
