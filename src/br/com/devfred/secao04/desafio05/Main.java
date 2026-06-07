package br.com.devfred.secao04.desafio05;

import br.com.devfred.secao04.desafio05.entities.Livro;
import br.com.devfred.secao04.desafio05.entities.ProdutoFisico;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", new BigDecimal("59.90"));
        System.out.println(String.format("Livro: %s - preço final: %.2f", livro.getNome(), livro.calcularPrecoFinal()));

        ProdutoFisico produto = new ProdutoFisico("MacBook", new BigDecimal("10000.00"));
        System.out.println(String.format("Produto: %s - preço final: %.2f", produto.getNome(), produto.calcularPrecoFinal()));
    }
}
