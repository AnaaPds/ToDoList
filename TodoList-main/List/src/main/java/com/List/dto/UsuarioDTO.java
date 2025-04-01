package com.List.dto;

import com.List.entity.Usuario;

public class UsuarioDTO {

    // Atributos do usuário
    private Long id;
    private String nome;
    private String email;

    // Construtor vazio
    public UsuarioDTO(){

    }

    // Construtor com todos os parâmetros
    public UsuarioDTO(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    // Construtor que converte um objeto Usuario em UsuarioDTO
    public UsuarioDTO(Usuario usuario){
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }

    // Getters e setters para os atributos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
