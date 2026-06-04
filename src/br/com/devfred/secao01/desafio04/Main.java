package br.com.devfred.secao01.desafio04;


import br.com.devfred.secao01.desafio04.entities.Carro;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Fusca", "Vinho", 1968);

        System.out.println(carro.getFichaTecnica());
        System.out.println(String.format("O carro tem %d anos" , carro.calculaIdade()));
    }
}