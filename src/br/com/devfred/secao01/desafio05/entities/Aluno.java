package br.com.devfred.secao01.desafio05.entities;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return """
                Nome do aluno(a): %s
                Idade: %d
                """.formatted(nome, idade);
    }
}
