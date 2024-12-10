package com.clinica.repository;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.persistence.internal.sessions.DirectCollectionChangeRecord.NULL;

import com.clinica.interfaces.RepositorioUsuarios;
import com.clinica.model.Usuario;

/**
 * Implementação da interface RepositorioUsuarios utilizando uma lista em memória.
 * Essa classe é adequada para protótipos ou aplicações que não precisam de persistência.
 */

public class RepositorioUsuarioList implements RepositorioUsuarios {
    /**
     * Lista que armazena os usuários.
     */
    private List<Usuario> usuarios;
    /**
     * Construtor que inicializa a lista de usuários.
     */
    public RepositorioUsuarioList(){
        usuarios = new ArrayList<Usuario>();
    }
    /**
     * Insere um novo usuário na lista.
     * 
     * @param usuario O objeto Usuario a ser adicionado.
     */
    @Override
    public void inserirUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    /**
     * Altera os dados de um usuário existente.
     * Ainda não implementado.
     * 
     * @param usuario O objeto Usuario com os dados atualizados.
     */
    @Override
    public void alterarUsuario(Usuario usuario) {
        
    }
    /**
     * Exclui um usuário com base no ID.
     * 
     * @param id_usuario O ID do usuário a ser excluído.
     */
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
    /**
     * Busca um usuário na lista com base no ID.
     * 
     * @param id_usuario O ID do usuário a ser buscado.
     * @return O objeto Usuario correspondente ou null se não for encontrado.
     */
    @Override
    public Usuario buscarUsuario(int id_usuario) {
        Usuario usuarioProcurado = null;
        for (Usuario usuario : usuarios){
            if (usuario.getId_usuario() == id_usuario) {
                //usuarioProcurado = usuario;
                return usuarioProcurado;
            }
        }
        return null; //RETORNA NULL SE NÃO FOR ENCONTRADO.
    }
    /**
     * Retorna a lista de todos os usuários.
     * 
     * @return Uma lista contendo todos os objetos Usuario.
     */
    @Override
    public List<Usuario> listarUsuarios() {
       return this.usuarios;
    }

}
