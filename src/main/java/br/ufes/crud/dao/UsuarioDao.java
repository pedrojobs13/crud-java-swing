/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufes.crud.dao;

import br.ufes.crud.model.Usuario;

import java.util.List;

/**
 * @author pedro lucas
 */
public interface UsuarioDao {
    void inserir(Usuario usuario);

    void atualizar(Usuario usuario, int id);

    void deletar(int id);

    List<Usuario> listar();
}
