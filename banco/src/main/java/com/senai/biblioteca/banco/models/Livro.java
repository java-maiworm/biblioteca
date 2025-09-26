package com.senai.biblioteca.banco.models;

import java.time.LocalDate;

public class Livro {
        private Long id;
        private String titulo;
        private String autor;
        private LocalDate lancamento;
        private String genero;
    
        public Emprestimo() {}
    
        public Emprestimo( String titulo, String autor, 
        LocalDate lancamento, String genero){
            this.titulo = titulo;
            this.autor = autor;
            this.lancamento = lancamento;
            this.genero = genero;
        }

        

}
