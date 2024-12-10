package com.clinica.interfaces;

import java.util.List;

import com.clinica.model.Usuario;

/**
 * Interface que define os métodos para operações de CRUD relacionadas a usuários.
 * Implementações dessa interface devem fornecer as funcionalidades para gerenciar
 * usuários no sistema.
 */

public interface RepositorioUsuarios {
    void inserirUsuario(Usuario usuario);
    void alterarUsuario(Usuario usuario);
    void excluirUsuario (int id_usuario);
    Usuario buscarUsuario (int id_usuario);;
    List<Usuario> listarUsuarios();
}
