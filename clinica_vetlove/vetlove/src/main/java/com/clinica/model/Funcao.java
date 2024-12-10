package com.clinica.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcao {
    private static int contadorFuncao = 0;
    private int id_funcao;
    private String descricao_funcao;
    public ArrayList<Usuario> usuarios;

    public Funcao() {
        this.id_funcao = ++contadorFuncao;
        this.descricao_funcao = "";
        this.usuarios = new ArrayList<Usuario>();
    }

    public Funcao(String descricao_funcao) {
        this.id_funcao = ++contadorFuncao;
        this.descricao_funcao = descricao_funcao;
        this.usuarios = new ArrayList<Usuario>();
    }

    public int getId_funcao() {
        return id_funcao;
    }

    public void setId_funcao(int id_funcao) {
        this.id_funcao = id_funcao;
    }

    public String getDescricao_funcao() {
        return descricao_funcao;
    }

    public void setDescricao_funcao(String descricao_funcao) {
        this.descricao_funcao = descricao_funcao;
    }

    // metodos
    public void adicionar_usuario(){
        Scanner input = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("\n========= cadastrar usuário =========");

        System.out.println("Insira o nome do(a) " + descricao_funcao + ": ");
        usuario.setNome_usuario(input.nextLine());

        System.out.println("Insira o login: ");
        usuario.setLogin(input.nextLine());

        System.out.println("Insira a senha: ");
        usuario.setSenha(input.nextLine());

        usuario.setId_funcao(id_funcao);

        usuario.setCargo(descricao_funcao);

        usuarios.add(usuario);
    }

    public void imprimir_usuarios(){
        for(Usuario usuario : usuarios){
            System.out.println("\n =======");
            System.out.println(usuario.imprimir());
        }
    }
}
