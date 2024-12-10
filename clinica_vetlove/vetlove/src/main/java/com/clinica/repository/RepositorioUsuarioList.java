package com.clinica.repository;

import java.util.ArrayList;
import java.util.List;

import com.clinica.interfaces.RepositorioUsuarios;
import com.clinica.model.Usuario;



public class RepositorioUsuarioList implements RepositorioUsuarios {
    private List<Usuario> usuarios;
    
    public RepositorioUsuarioList(){
        usuarios = new ArrayList<Usuario>();
    }

    @Override
    public void inserirUsuario(Usuario usuario) {
        usuario.add(usuario);
    }

    @Override
    public void alterarUsuario(Usuario usuario) {
        
    }

    @Override
    public void excluirUsuario(int id_usuario) {
        int posicao = -1;
        for (Usuario usuario: usuarios){
            if (usuario.getId_usuario() == id_usuario) {
                posicao = usuarios.indexOf(usuario);
            }
        }
        if (posicao != -1) {
            usuarios.remove(posicao);
        }
    }

    @Override
    public Usuario buscarUsuario(int id_usuario) {
        Usuario usuarioProcurado = null;
        for (Usuario usuario : usuarios){
            if (usuario.getId_usuario() == id_usuario) {
                usuarioProcurado = usuario;
            }
        }
        return usuarioProcurado;
    }

    @Override
    public List<Usuario> listarUsuarios() {
       return this.usuarios;
    }

}
