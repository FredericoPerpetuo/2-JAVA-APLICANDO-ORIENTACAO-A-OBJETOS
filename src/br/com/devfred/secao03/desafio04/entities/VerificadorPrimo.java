package br.com.devfred.secao03.desafio04.entities;

public class VerificadorPrimo extends NumerosPrimos {

    public void verificaSeEhPrimo(int numero){
        if(verificarPrimalidade(numero)){
            System.out.println(String.format("%d é primo", numero));
        }else{
            System.out.println(String.format("%d não é primo", numero));
        }
    }
}
