/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufes.crud.presenter;

import br.ufes.crud.dao.UsuarioDao;
import br.ufes.crud.dao.UsuarioDaoImpl;
import br.ufes.crud.model.Usuario;
import br.ufes.crud.view.ManterUsuarioView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * @author pedro lucas
 */
public class IncluirPresenter {

    private UsuarioDao usuarioDao;
    private ManterUsuarioView view;

    public IncluirPresenter() {
        usuarioDao = new UsuarioDaoImpl();
        view = new ManterUsuarioView();
        view.getBtnSalvar().addActionListener((ActionEvent e) -> {
            salvar();
        });
        view.getBtnCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });
        view.setVisible(true);
    }

    private void salvar() {
        String nome = view.getTxtNome().getText();
        String senha = view.getTxtSenha().getText();
        Usuario usuario = new Usuario.Builder()
                .nome(nome)
                .senha(senha)
                .build();
        usuarioDao.inserir(usuario);

        JOptionPane.showMessageDialog(view, "Contato Salvo");
        
    }

    private void cancelar() {
        view.dispose();
    }
}
