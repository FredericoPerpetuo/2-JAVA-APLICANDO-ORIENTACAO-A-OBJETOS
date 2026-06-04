package br.com.devfred.secao03.desafio03;


import br.com.devfred.secao03.desafio03.entities.ContaCorrente;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Fulano", "222", "2121-2", 10.0);
        System.out.println(String.format("Saldo inicial = R$%.2f", cc.getSaldo()));
        cc.deposita(1000.0);
        System.out.println(String.format("Saldo após depósito = R$%.2f", cc.getSaldo()));
        cc.saca(100);
        System.out.println(String.format("Saldo após saque = R$%.2f", cc.getSaldo()));
        cc.cobrarTarifaMensal();
        System.out.println(String.format("Saldo após conbrança de tarifa = R$%.2f", cc.getSaldo()));

        System.out.println();
    }
}