package br.com.devfred.secao04.desafio06.interfaces;

import java.math.BigDecimal;

public interface Vendavel {
    BigDecimal caculaPrecoPorQuantidade(int qtd);
    void aplicarDesconto(double percentualDesconto);
}
