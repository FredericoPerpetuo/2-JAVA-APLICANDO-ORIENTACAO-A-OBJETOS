package br.com.devfred.secao04.desafio01;

import br.com.devfred.secao04.desafio01.entities.ConversorMoeda;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal qtdDolar = new BigDecimal("25");
        BigDecimal cotacaoDolar = new BigDecimal("4.75");
        ConversorMoeda conversorMoeda = new ConversorMoeda(qtdDolar, cotacaoDolar);

        System.out.println(String.format("$%.2f = R$%.2f", qtdDolar, conversorMoeda.converterDolarParaReal()));
    }
}
