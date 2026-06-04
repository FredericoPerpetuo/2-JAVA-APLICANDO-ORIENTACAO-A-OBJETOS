package br.com.devfred.secao02.desafio01.helpers;


import br.com.devfred.secao02.desafio01.entities.Conta;

public class ContaHelper {

    public static String realizaSaque(Conta conta, String vlrSaque){
        String msg = null;
        return  conta.saca(vlrSaque) ? "Saque realizado com sucesso" : "Saldo insuficiente";

    }

    public static String realizaDeposito(Conta conta, String vlrDeposito){
        String msg = "O valor deve ser maior que zero";
        if(Double.parseDouble(vlrDeposito) > 0.0){
            conta.deposita(vlrDeposito);
            msg = "Deposito realizado com sucesso";
        }
        return msg;
    }
}
