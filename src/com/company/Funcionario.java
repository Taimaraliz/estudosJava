package com.company;

public class Funcionario {

    private String nome;
    private int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public void cadastrarLivro(String titulo, String autor, int anoPublicacao, String estado) {
        Livro novoLivro = new Livro(titulo, autor, anoPublicacao, estado);

    }

    public void cadastrarUsuario(String nome, int id) {
        Usuario novoUsuario = new Usuario(nome, id);

    }

    public void emprestarLivro(Livro livro, Usuario usuario) {
            if (livro.estaDisponivel()) {
                livro.alterarEstado("Emprestado");
                
                System.out.println("Livro " + livro.getTitulo() + " emprestado para o usuário " + usuario.getNome());
                usuario.adicionarLivro(livro);
            } else {
                System.out.println("Livro " + livro.getTitulo() + " não está disponível para empréstimo.");
            }
        }

        // Método para devolver um livro
        public void devolverLivro (Usuario usuario, Livro livro){
            livro.devolver();
            usuario.removerLivro(livro);
        }


    public void consultarUsuario(int i) {
        System.out.println("Consultando informações do usuário com ID: " + id);
    }
}

