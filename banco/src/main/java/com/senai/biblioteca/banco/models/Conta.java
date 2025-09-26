package com.senai.biblioteca.banco.models;

public class Conta {
    private Long id;
    private String username;
    private String senha;
    private String email;
    private String telefone;
    private boolean professor;

    public Conta() {}

    public Conta( String username, String senha, 
    String email, String telefone, boolean professor){
        this.username = username;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.professor = professor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isProfessor() {
        return professor;
    }

    public void setProfessor(boolean professor) {
        this.professor = professor;
    }

    

}

