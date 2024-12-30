/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufes.crud.dao;

import br.ufes.crud.model.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author pedro lucas
 */
public class UsuarioDao {

    private final List<Usuario> usuarios = new ArrayList<>();

    public void add(String nome, String senha) {
        usuarios.add(new Usuario.Builder()
                .nome(nome)
                .senha(senha)
                .build());
    }

    public List<Usuario> listagem() {
        return usuarios;
    }

    public Usuario buscarUsuarioPeloNome(String nome) {
        return usuarios.stream().filter(e -> e.getNome().contains(nome))
                .findFirst()
                .orElse(null);
    }
}
