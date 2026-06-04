package br.com.devfred.secao02.desafio03;


import br.com.devfred.secao02.desafio03.entities.Produto;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Produto prod = new Produto("PC GAMER", new BigDecimal("70000"));
        System.out.println(String.format("Preço original R$%.2f", prod.getPreco()));
        System.out.println(String.format("Preço com desconto de 10%% R$%.2f", prod.aplicarDesconto(10)));

    }
}