package com.company;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String estado;


    public Livro(String titulo, String autor, int anoPublicacao, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.estado = estado;
    }

    public boolean estaDisponivel() {
        return estado.equals("Disponível");
    }

    public void alterarEstado(String novoEstado) {
        this.estado = novoEstado;
    }

    public String getTitulo() {
        return titulo;
    }


    public void emprestar() {
        if (this.estado.equals("disponível")) {
            this.estado = "emprestado";
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }


    public void devolver() {
        if (this.estado.equals("emprestado")) {
            this.estado = "disponível";
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro não está emprestado.");
        }
    }
}

