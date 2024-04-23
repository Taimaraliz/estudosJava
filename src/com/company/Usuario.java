package com.company;

import java.util.List;
import java.util.ArrayList;

public class Usuario {

    private String nome;
    private int id;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }


    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    // Método para remover um livro

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public void visualizarLivrosEmprestimos() {
        if (!livrosEmprestados.isEmpty()) {
            System.out.println("Livros emprestados:");
            for (Livro livro : livrosEmprestados) {
                System.out.println(livro);
            }
        } else {
            System.out.println("Não possui livros emprestados");
        }
    }

    public String getNome() {
        return nome;
    }
}

