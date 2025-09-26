package com.senai.biblioteca.banco.models;

import java.time.LocalDateTime;

public class Emprestimo {
    private Long id;
    private int idConta;
    private int idLivro;
    private LocalDateTime data;
    private String notacao;

    public Emprestimo() {}

    public Emprestimo( int idConta, int idLivro, 
    LocalDateTime data, String notacao){
        this.idConta = idConta;
        this.idLivro = idLivro;
        this.data = data;
        this.notacao = notacao;
    }

    //Source actions parou de funcionar
    

}

