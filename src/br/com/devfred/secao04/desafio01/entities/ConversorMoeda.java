package br.com.devfred.secao04.desafio01.entities;

import br.com.devfred.secao04.desafio01.interfaces.ConversaoFinanceira;

import java.math.BigDecimal;

public class ConversorMoeda implements ConversaoFinanceira {
    private BigDecimal qtdDolar;
    private BigDecimal cotacaoDolar;

    public ConversorMoeda(BigDecimal qtdDolar, BigDecimal cotacaoDolar){
        this.qtdDolar = qtdDolar;
        this.cotacaoDolar = cotacaoDolar;
    }

    @Override
    public BigDecimal converterDolarParaReal() {
        return qtdDolar.multiply(cotacaoDolar);
    }
}
