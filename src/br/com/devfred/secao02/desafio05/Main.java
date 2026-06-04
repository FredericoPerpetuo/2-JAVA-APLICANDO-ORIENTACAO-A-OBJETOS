package br.com.devfred.secao02.desafio05;


import br.com.devfred.secao02.desafio05.entities.Livro;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("O Capital", "Karl Marx");
        System.out.println(livro1.exibirDetalhes());

        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
        System.out.println(livro2.exibirDetalhes());
    }
}