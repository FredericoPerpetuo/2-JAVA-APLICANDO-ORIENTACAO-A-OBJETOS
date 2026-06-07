package br.com.devfred.secao04.desafio06;

import br.com.devfred.secao04.desafio06.entities.Produto;
import br.com.devfred.secao04.desafio06.entities.Servico;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta lisa", new BigDecimal(39.90));
        System.out.println(String.format("Preço total sem desconto: R$%.2f",produto.caculaPrecoPorQuantidade(10)));
        produto.aplicarDesconto(10);
        System.out.println(String.format("Preço total com desconto: R$%.2f",produto.caculaPrecoPorQuantidade(10)));

        Servico servico = new Servico("Consultoria", new BigDecimal(50.00));
        System.out.println(String.format("Preço total sem desconto: R$%.2f", servico.caculaPrecoPorQuantidade(10)));
        servico.aplicarDesconto(15);
        System.out.println(String.format("Preço total com desconto: R$%.2f",servico.caculaPrecoPorQuantidade(10)));
    }
}
