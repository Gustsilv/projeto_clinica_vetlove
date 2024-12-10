package com.clinica.controller;

import java.util.Scanner;

import com.clinica.interfaces.RepositorioUsuarios;
import com.clinica.model.Usuario;
import com.clinica.repository.RepositorioUsuarioList;
import com.clinica.repository_jpa.UsuarioRepository;



public class usuarioController {
    RepositorioUsuarios usuarios;
    Usuario usuario =  new Usuario();
    Scanner leia = new Scanner(System.in);
    //Scanner leia2 = new Scanner(System.in);
    String loginUsuario, senhaUsuario;
    int id_usuario;


    public void CriarUsuario() {
        usuarios = new RepositorioUsuarioList();
        System.out.println("Digite o login do usuário: ");
        loginUsuario = leia.next();
        usuario.setLogin(loginUsuario); 
        System.out.println("Digite a senha de acesso: ");
        senhaUsuario = leia.next();
        usuario.setSenha(senhaUsuario); //Aqui é uma aposta, quero que o valor inserido nesse método seja guardado na variável;
        UsuarioRepository.salvarUsuario(usuario); //A classe UsuarioRepository ainda não foi criada
    
    }

    public void buscarUsuarioPorLogin(){
        System.out.println("Digite o login do usuário a ser procurado:");
        loginUsuario = leia.next();
        System.out.println("Informações do Usuário: " + usuario.buscarUsuarioPorLogin(loginUsuario)); //Aqui ele vai buscar o método login na classe Usuário
        //Torna-se necessario configurar as entidades

    }

    public void removerUsuarioPorId(){
        System.out.println("Digite o ID do usuário a ser procurado:");
        id_usuario = leia.nextInt();
        UsuarioRepository.removerContaPorId(id_usuario);
    }
    //Vai ser necessário verificar se vai funcionar, pois não tenho certeza se as variáveis estão conectadas
    public void listarTodosUsuarios(){
        System.out.println("Lista de Usuários: ");
        for (Usuario usuarios: UsuarioRepository.listAll()){
            System.out.println(usuarios);
        }
    }
}
