package com.List.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_tarefa")
public class Tarefas {

    // ID da tarefa, gerado automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relacionamento ManyToOne com o usuário, muitas tarefas pode pertencer a um usuário
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false) // Define a coluna 'usuario_id' na tabela, com restrição para não ser nula
    private Usuario usuario;
    private String descricao;
    private String setor;
    private Prioridade prioridade;
    private LocalDateTime dataCadastro = LocalDateTime.now(); // Define a data de cadastro com o valor atual (hora e data no momento da criação)
    private Status status = Status.A_FAZER; // Define o status inicial como "A_FAZER"


   // Construtor vazio
    public Tarefas(){

    }

    // Construtor com todos os parâmetros
    public Tarefas(Long id, Usuario usuario, String descricao, String setor,
                   Prioridade prioridade,
                   LocalDateTime dataCadastro, Status status) {
        this.id = id;
        this.usuario = usuario;
        this.descricao = descricao;
        this.setor = setor;
        this.prioridade = prioridade;
        this.dataCadastro = dataCadastro;
        this.status = status;
    }

    //Gerar os Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

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
