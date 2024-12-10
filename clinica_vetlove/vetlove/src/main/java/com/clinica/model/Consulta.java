package com.clinica.model;

import java.time.LocalDate;

public class Consulta extends Atendimento {
    private static int contadorConsulta = 0;
    private int id_consulta;
    private LocalDate data_hora_consulta;
    private Exame exame;
    private Medicamento medicamento;
    private float temp_Animal;
    private float peso_Animal;
    private String diagnostico;
    private String observacoes_prontuario;
    
        //construtor
        public Consulta(int id_pet, int id_usuario) {
            super(id_pet, id_usuario, "Consulta", 150.00);
            this.id_consulta = ++contadorConsulta;
            this.data_hora_consulta = LocalDate.now();
            this.exame = null;
            this.medicamento = null;
            this.diagnostico = "";
            this.observacoes_prontuario = "";
            this.temp_Animal = 0.0f;
            this.peso_Animal = 0.0f;
        }

        public Consulta(int id_consulta, LocalDate data_hora_consulta, Atendimento atendimento) {
            super(atendimento.getId_pet(), atendimento.getId_usuario(), atendimento.getTipo_atendimento(), atendimento.getValor());
            this.id_consulta = id_consulta;
            this.data_hora_consulta = data_hora_consulta;
            this.exame = null;
            this.medicamento = null;
            this.diagnostico = "";
            this.observacoes_prontuario = "";
            this.temp_Animal = 0.0f;
            this.peso_Animal = 0.0f;
        }

    

    //métodos de acesso
    public int getId_consulta() {
        return id_consulta;
    }
    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }
    public LocalDate getData_hora_consulta() {
        return data_hora_consulta;
    }
    public void setData_hora_consulta(LocalDate dataHoraConsulta) {
        this.data_hora_consulta = dataHoraConsulta;
    }
    
    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
    public float getTemp_Animal() {
        return temp_Animal;
    }

    public void setTemp_Animal(float temp_Animal) {
        this.temp_Animal = temp_Animal;
    }

    public float getPeso_Animal() {
        return peso_Animal;
    }

    public void setPeso_Animal(float peso_Animal) {
        this.peso_Animal = peso_Animal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservacoes_prontuario() {
        return observacoes_prontuario;
    }

    public void setObservacoes_prontuario(String observacoes_prontuario) {
        this.observacoes_prontuario = observacoes_prontuario;
    }

    public String destalhesConsulta() {
        String detalhes = "Data e Hora: " + data_hora_consulta + 
                          "\nObservações do prontuário: " + (observacoes_prontuario.isEmpty() ? "Não informado" : observacoes_prontuario) +
                          "\nTemperatura do animal: " + (temp_Animal > 0 ? temp_Animal : "Não medida") +
                          "\nPeso do animal: " + (peso_Animal > 0 ? peso_Animal : "Não medido") +
                          "\nDiagnóstico: " + (diagnostico.isEmpty() ? "Não informado" : diagnostico) +
                          "\nValor: R$" + super.getValor();
        return detalhes;
    }
    
}