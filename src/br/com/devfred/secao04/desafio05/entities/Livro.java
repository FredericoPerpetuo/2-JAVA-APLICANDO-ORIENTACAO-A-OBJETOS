package br.com.devfred.secao04.desafio05.entities;

import br.com.devfred.secao04.desafio05.interfaces.Calculavel;

import java.math.BigDecimal;

public class Livro implements Calculavel {
    private String nome;
    private BigDecimal preco;

    public Livro(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public BigDecimal calcularPrecoFinal() {
        return preco.subtract(preco.multiply(new BigDecimal("0.1")));
    }
}
