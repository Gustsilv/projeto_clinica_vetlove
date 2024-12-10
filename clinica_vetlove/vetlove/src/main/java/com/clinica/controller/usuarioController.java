package com.clinica.controller;

import java.util.Scanner;

import com.clinica.interfaces.RepositorioUsuarios;
import com.clinica.model.Usuario;
import com.clinica.repository.RepositorioUsuarioList;



public class usuarioController {
    RepositorioUsuarios usuarios;
    Usuario usuario =  new Usuario();
    Scanner leia = new Scanner(System.in);
    //Scanner leia2 = new Scanner(System.in);
    String loginUsuario, senhaUsuario;


    public void CriarUsuario() {
        usuarios = new RepositorioUsuarioList();
        System.out.println("Digite o login do usuário: ");
        loginUsuario = leia.next();
        System.out.println("Digite a senha de acesso: ");
        senhaUsuario = leia.next();
        usuario.setSenha(senhaUsuario); //Aqui é uma aposta, quero que o valor inserido nesse método seja guardado na variável;
        //UsuarioRepository.salvarUsuario(usuario); //A classe UsuarioRepository ainda não foi criada
    }
}
