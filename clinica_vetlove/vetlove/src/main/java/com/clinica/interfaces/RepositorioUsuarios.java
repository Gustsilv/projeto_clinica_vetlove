package com.clinica.interfaces;

import java.util.List;

import com.clinica.model.Usuario;

;

public interface RepositorioUsuarios {
    void inserirUsuario(Usuario usuario);
    void alterarUsuario(Usuario usuario);
    void excluirUsuario (int id_usuario);
    Usuario buscarUsuario (int id_usuario);;
    List<Usuario> listarUsuarios();
}
