package com.clinica.model;

import java.time.LocalDate;

public class Exame extends Consulta{
    private int id_exame;
    private String nome_exame;
    private String descricao_exame;

    //Construtores
    public Exame(int id_consulta, LocalDate data_hora_consulta, Atendimento atendimento, int id_exame,
            String nome_exame, String descricao_exame) {
        super(id_consulta, data_hora_consulta, atendimento);
        this.id_exame = id_exame;
        this.nome_exame = nome_exame;
        this.descricao_exame = descricao_exame;
    }
    public Exame(int id_pet, int id_usuario, int id_exame, String nome_exame, String descricao_exame) {
        super(id_pet, id_usuario);
        this.id_exame = id_exame;
        this.nome_exame = nome_exame;
        this.descricao_exame = descricao_exame;
    }
    
    
    //Getters and Setters dos atributos
    public int getId_exame() {
        return id_exame;
    }
    public void setId_exame(int id_exame) {
        this.id_exame = id_exame;
    }
    public String getNome_exame() {
        return nome_exame;
    }
    public void setNome_exame(String nome_exame) {
        this.nome_exame = nome_exame;
    }
    public String getDescricao_exame() {
        return descricao_exame;
    }
    public void setDescricao_exame(String descricao_exame) {
        this.descricao_exame = descricao_exame;

    } 

    public String detalhesExame(){
        return "Informações sobre o exame:\nNome do exame: " + nome_exame + "\nDescrição do exame:" + descricao_exame;
    }
}
