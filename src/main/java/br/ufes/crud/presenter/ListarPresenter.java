/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufes.crud.presenter;

import br.ufes.crud.dao.UsuarioDao;
import br.ufes.crud.dao.UsuarioDaoImpl;
import br.ufes.crud.model.Usuario;
import br.ufes.crud.view.PrincipalView;

import java.util.ListIterator;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 * @author pedro lucas
 */
public class ListarPresenter {

    private final UsuarioDao usuarioDao;
    private final PrincipalView view;
    private final DefaultTableModel tbUsuarios;

    public ListarPresenter(PrincipalView principalView) {
        usuarioDao = new UsuarioDaoImpl();
        tbUsuarios = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Nome", "Senha"}
        );

        view = principalView;
        view.initView(this);
        view.getTbUsuarios().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        view.getTbUsuarios().setModel(tbUsuarios);

        listarUsuarios();
    }

    public void listarUsuarios() {
        tbUsuarios.setRowCount(0);
        ListIterator<Usuario> it = usuarioDao.listar().listIterator();

        while (it.hasNext()) {
            Usuario usuario = it.next();
            tbUsuarios.addRow(new Object[]{usuario.getNome(), usuario.getSenha()});
        }
    }
}
