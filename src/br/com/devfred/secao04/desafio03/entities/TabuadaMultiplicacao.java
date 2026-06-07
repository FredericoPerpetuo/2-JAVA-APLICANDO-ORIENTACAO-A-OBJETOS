package br.com.devfred.secao04.desafio03.entities;

import br.com.devfred.secao04.desafio03.interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    private int numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        System.out.println("TABUADA MULTIPLICAÇÃO");
        for (int i = 0; i <= numero ; i++) {
            System.out.println(String.format("%d * %d = %d", i, numero, (i * numero) ));
        }
        System.out.println("==============================================");
    }
}
