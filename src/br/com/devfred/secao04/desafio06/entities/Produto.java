package br.com.devfred.secao04.desafio06.entities;

import br.com.devfred.secao04.desafio06.interfaces.Vendavel;

import java.math.BigDecimal;

public class Produto implements Vendavel {
    private String nome;
    private BigDecimal precoUnidade;

    public Produto(String nome, BigDecimal precoUnidade) {
        this.nome = nome;
        this.precoUnidade = precoUnidade;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPrecoUnidade() {
        return precoUnidade;
    }

    @Override
    public BigDecimal caculaPrecoPorQuantidade(int qtd) {
        BigDecimal quantidade = new BigDecimal(qtd);
        return quantidade.multiply(precoUnidade);
    }

    @Override
    public void aplicarDesconto(double percentualDescont) {
        precoUnidade = precoUnidade.subtract(precoUnidade.multiply(new BigDecimal(percentualDescont)).divide(new BigDecimal("100.0")));
    }
}
