package com.clinica.model;

import java.time.LocalDate;

public class Medicamento extends Consulta {
    private int idMedicamento;
    private String nomeMedicamento;
    private String receita;

    //Construtores
    public Medicamento(int id_pet, int id_usuario, int idMedicamento, String nomeMedicamento, String receita) {
        super(id_pet, id_usuario);
        this.idMedicamento = idMedicamento;
        this.nomeMedicamento = nomeMedicamento;
        this.receita = receita;
    }
    public Medicamento(int id_consulta, LocalDate data_hora_consulta, Atendimento atendimento, int idMedicamento,
            String nomeMedicamento, String receita) {
        super(id_consulta, data_hora_consulta, atendimento);
        this.idMedicamento = idMedicamento;
        this.nomeMedicamento = nomeMedicamento;
        this.receita = receita;
    }
    
    //Métodos
    public int getIdMedicamento() {
        return idMedicamento;
    }
    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }
    public String getNomeMedicamento() {
        return nomeMedicamento;
    }
    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }
    public String getReceita() {
        return receita;
    }
    public void setReceita(String receita) {
        this.receita = receita;
    }

    public String detalhesMedicamento(){
        return "Receituário:\nNome do medicamento: " + nomeMedicamento + "\nDescrição: " + receita;
    }
    
}
