package br.com.devfred.secao03.desafio04.entities;

public class GeradorPrimo extends NumerosPrimos{

    public int gerarProximoPrimo(int atual){
        int proximo = atual;
        while(true){
            if(proximo != atual && verificarPrimalidade(proximo)){
                return proximo;
            }
            proximo++;
        }
    }
}
