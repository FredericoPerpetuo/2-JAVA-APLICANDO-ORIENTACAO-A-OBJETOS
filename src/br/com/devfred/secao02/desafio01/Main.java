package br.com.devfred.secao02.desafio01;


import br.com.devfred.secao02.desafio01.entities.Conta;
import br.com.devfred.secao02.desafio01.helpers.ContaHelper;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Cidadão Comum", 0001, 111);
        System.out.println(ContaHelper.realizaSaque(conta,"100"));

        System.out.println(ContaHelper.realizaDeposito(conta, "1000"));
        System.out.println(String.format("Saldo R$%.2f", conta.getSaldo()));
        System.out.println(ContaHelper.realizaSaque(conta,"100"));
        System.out.println(String.format("Saldo R$%.2f", conta.getSaldo()));
        System.out.println(ContaHelper.realizaDeposito(conta, "1000"));
        System.out.println(String.format("Saldo R$%.2f", conta.getSaldo()));

    }
}