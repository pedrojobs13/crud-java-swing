/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufes.crud.presenter;

import br.ufes.crud.dao.UsuarioDao;
import br.ufes.crud.dao.UsuarioDaoImpl;
import br.ufes.crud.view.ConfirmaExclucaoView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pedro lucas
 */
public class ExcluirPresenter {
    
    private final ConfirmaExclucaoView view;
    private final Integer id;
    private final UsuarioDao usuarioDao;
    
    public ExcluirPresenter(Integer id) {
        usuarioDao = new UsuarioDaoImpl();
        this.id = id;
        view = new ConfirmaExclucaoView();
        view.getBtnConfirma().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deletar();
            }
        });
        view.getBtnNegar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelar();
            }
        });
        
        view.setVisible(true);
    }
    
    private void deletar() {
        usuarioDao.deletar(id);
    }
    
    private void cancelar() {
        view.dispose();
    }
}
