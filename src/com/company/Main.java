package com.company;

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro("Tudo Sobre Amor", "Hooks Bell", 1995, "Disponível");
        Funcionario funcionario1 = new Funcionario("Ana Carla", 458);
        Usuario usuario1 = new Usuario("Taimara Liz", 123);


        funcionario1.cadastrarUsuario("Maria João", 321);


        funcionario1.consultarUsuario(456);
    }
}



