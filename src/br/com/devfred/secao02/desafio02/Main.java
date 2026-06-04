package br.com.devfred.secao02.desafio02;


import br.com.devfred.secao02.desafio02.entities.IdadePessoa;

public class Main {
    public static void main(String[] args) {

        IdadePessoa idp1 = new IdadePessoa("Sofia Araújo", 42);
        System.out.println(String.format("%s é maior de idade? %b", idp1.getNome(), idp1.ehMaiorDeIdade(idp1.getIdade())));

        IdadePessoa idp2 = new IdadePessoa("Eduardo Oliveira", 18);
        System.out.println(String.format("%s é maior de idade? %b", idp2.getNome(), idp2.ehMaiorDeIdade(idp2.getIdade())));

        IdadePessoa idp3 = new IdadePessoa("Luna Duarte", 15);
        System.out.println(String.format("%s é maior de idade? %b", idp3.getNome(), idp3.ehMaiorDeIdade(idp3.getIdade())));

    }
}