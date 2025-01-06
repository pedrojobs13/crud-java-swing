/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufes.crud.dao;

import br.ufes.crud.model.Usuario;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pedro lucas
 */
public class UsuarioDaoImpl implements UsuarioDao {
    private Connection connection;
    private final List<Usuario> usuarios = new ArrayList<>();

    public UsuarioDaoImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:banco.db");
            Statement statement = connection.createStatement();

            String sql =
                    "CREATE TABLE IF NOT EXISTS usuarios (\n"
                            + "	id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                            + "	nome text NOT NULL,\n"
                            + "	senha text NOT NULL,\n"
                            + " dataCriacao text NOT NULL\n"
                            + ");";

            statement.execute(sql);
            System.out.println("O Banco foi iniciado");
        } catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível conectar ao banco");
        }
    }

    @Override
    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, senha, dataCriacao) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getSenha());
            pstmt.setString(3, usuario.getDataCriacao().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível inserir o usuário", e);
        }
    }

    @Override
    public void atualizar(Usuario usuario, int id) {
        String sql = "UPDATE produto SET nome = ?, " + "senha = ? " + "WHERE id = ?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getSenha());
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possível atualizar objeto, pois o mesmo não existe");
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT nome, senha, dataCriacao FROM usuarios";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                LocalDateTime dataCriacao = LocalDateTime.parse(rs.getString("dataCriacao"), DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                Usuario usuario = new Usuario.Builder()
                        .nome(nome)
                        .senha(senha)
                        .build();
                usuario.setDataCriacao(dataCriacao);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException("Não foi possível listar os usuários", e);
        }
        return usuarios;
    }
}
