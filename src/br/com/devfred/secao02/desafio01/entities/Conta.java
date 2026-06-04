package br.com.devfred.secao02.desafio01.entities;

import java.math.BigDecimal;

public class Conta {
    private String titular;
    private int numero;
    private int agencia;
    private BigDecimal saldo = new BigDecimal("0");

    public Conta(String titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(String vlr){
        BigDecimal deposito = new BigDecimal(vlr);
        saldo = saldo.add(deposito);
    }

    public boolean saca(String vlr){
        BigDecimal saque = new BigDecimal(vlr);
        boolean realizadoComSucesso = false;
        if(saldo.compareTo(saque) > 0){
            realizadoComSucesso = true;
            saldo = saldo.subtract(saque);
        }
        return realizadoComSucesso;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
