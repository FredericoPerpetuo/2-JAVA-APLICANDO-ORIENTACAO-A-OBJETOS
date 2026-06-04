package br.com.devfred.secao02.desafio03.entities;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal preco;

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal aplicarDesconto(double porcentagem){
        BigDecimal desconto = preco.multiply(new BigDecimal(porcentagem)).divide(new BigDecimal(100));
        return preco.subtract(desconto);
    }
}
