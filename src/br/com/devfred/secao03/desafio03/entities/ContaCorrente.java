package br.com.devfred.secao03.desafio03.entities;

import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal;

    public ContaCorrente(String titular, String agencia, String numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal(){
        saldo = saldo.subtract(new BigDecimal(tarifaMensal));
    }
}
