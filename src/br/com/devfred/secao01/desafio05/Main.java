package br.com.devfred.secao01.desafio05;


import br.com.devfred.secao01.desafio05.entities.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos", 18);
        System.out.println(aluno1.toString());

        Aluno aluno2 = new Aluno("Joana", 17);
        System.out.println(aluno2.toString());

    }
}