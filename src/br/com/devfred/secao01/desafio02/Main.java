package br.com.devfred.secao01.desafio02;

import br.com.devfred.secao01.desafio02.entities.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero = 25;
        System.out.println(String.format("O dobro de %d é %d", numero, calculadora.dobro(numero)));
    }
}
