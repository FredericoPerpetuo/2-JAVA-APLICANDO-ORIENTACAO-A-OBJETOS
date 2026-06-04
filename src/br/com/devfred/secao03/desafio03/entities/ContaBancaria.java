package br.com.devfred.secao03.desafio03.entities;

import java.math.BigDecimal;

public class ContaBancaria {
    private String titular;
    private String numero;
    private String agencia;
    protected BigDecimal saldo = new BigDecimal("0");

    public ContaBancaria(String titular, String agencia, String numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double vlr){
        BigDecimal deposito = new BigDecimal(vlr);
        saldo = saldo.add(deposito);
    }

    public boolean saca(double vlr){
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
