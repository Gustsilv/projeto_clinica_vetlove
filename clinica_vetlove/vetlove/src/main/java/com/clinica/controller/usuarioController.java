package com.clinica.controller;

import java.util.Scanner;

import com.clinica.interfaces.RepositorioUsuarios;
import com.clinica.model.Usuario;
import com.clinica.repository.RepositorioUsuarioList;
import com.clinica.repository_jpa.UsuarioRepository;

/**
 * Classe responsável por gerenciar as operações relacionadas aos usuários.
 * Permite criar, buscar, remover e listar usuários do sistema.
 */

public class usuarioController {
    RepositorioUsuarios usuarios;
    Usuario usuario =  new Usuario();
    Scanner leia = new Scanner(System.in);
    //Scanner leia2 = new Scanner(System.in);
    String loginUsuario, senhaUsuario;
    int id_usuario;

    /**
     * Método responsável por criar um novo usuário no sistema.
     * Requer que o login e a senha sejam informados pelo usuário.
     */

    public void CriarUsuario() {
        usuarios = new RepositorioUsuarioList();
        System.out.println("Digite o login do usuário: ");
        loginUsuario = leia.next();
        usuario.setLogin(loginUsuario); 
        System.out.println("Digite a senha de acesso: ");
        senhaUsuario = leia.next();
        usuario.setSenha(senhaUsuario); // Armazena a senha no objeto Usuario
        UsuarioRepository.salvarUsuario(usuario); 
        
    }
    /**
     * Método responsável por buscar um usuário com base no login informado.
     * Exibe as informações do usuário se ele for encontrado.
     */
    public void buscarUsuarioPorLogin(){
        System.out.println("Digite o login do usuário a ser procurado:");
        loginUsuario = leia.next();
        System.out.println("Informações do Usuário: " + usuario.buscarUsuarioPorLogin(loginUsuario)); //Aqui ele vai buscar o método login na classe Usuário
        // ATENÇÃO: CONFIGURAR O MÉTODO buscarUsuarioPorLogin NA CLASSE Usuario

    }
    /**
     * Método responsável por remover um usuário com base no ID informado.
     * Exclui o registro do sistema.
     */
    public void removerUsuarioPorId(){
        System.out.println("Digite o ID do usuário a ser procurado:");
        id_usuario = leia.nextInt();
        UsuarioRepository.removerContaPorId(id_usuario);
    }
    /// ATENÇÃO: VALIDAR SE O MÉTODO removerContaPorId ESTÁ IMPLEMENTADO NA CLASSE UsuarioRepository
    
    /**
     * Método responsável por listar todos os usuários cadastrados no sistema.
     * Exibe os usuários no console.
     */
    public void listarTodosUsuarios(){
        System.out.println("Lista de Usuários: ");
        for (Usuario usuarios: UsuarioRepository.listAll()){
            System.out.println(usuarios);
        }
    }
}
