package br.com.devfred.secao02.desafio04;


import br.com.devfred.secao02.desafio04.entities.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos", 60.0,80.9,77.5);
        System.out.println(String.format("A médida de %s é %.2f", aluno1.getNome(), aluno1.calculaMedia()));

        Aluno aluno2 = new Aluno("Joana", 70.0, 90.9, 68.5);
        System.out.println(String.format("A médida de %s é %.2f", aluno2.getNome(), aluno2.calculaMedia()));
    }
}