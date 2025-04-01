package com.List.dto;

import com.List.entity.Prioridade;
import com.List.entity.Status;
import com.List.entity.Tarefas;

import java.time.LocalDateTime;

public class TarefasDTO {

     // Atributos que correspondem aos dados da tarefa
    private String descricao;
    private String setor;
    private Prioridade prioridade;
    private LocalDateTime dataCadastro = LocalDateTime.now(); // Data de cadastro com valor padrão
    private Status status;

    //Construtor vazio
    public TarefasDTO(){

    }

    // Construtor com todos os parâmetros
    public TarefasDTO(String descricao, String setor,
                      Prioridade prioridade, LocalDateTime dataCadastro,
                      Status status) {
        this.descricao = descricao;
        this.setor = setor;
        this.prioridade = prioridade;
        this.dataCadastro = dataCadastro;
        this.status = status;
    }

    // Construtor que converte um objeto Tarefas em TarefasDTO
    public TarefasDTO(Tarefas tarefas){
        this.descricao = tarefas.getDescricao();
        this.setor = tarefas.getSetor();
        this.prioridade = tarefas.getPrioridade();
        this.dataCadastro = tarefas.getDataCadastro();
        this.status = tarefas.getStatus();
    }

    // Getters e setters para cada atributo
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
