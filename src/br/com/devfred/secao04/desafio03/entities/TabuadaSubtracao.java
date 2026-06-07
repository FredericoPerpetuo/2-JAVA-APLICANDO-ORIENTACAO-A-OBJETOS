package br.com.devfred.secao04.desafio03.entities;

import br.com.devfred.secao04.desafio03.interfaces.Tabuada;

public class TabuadaSubtracao implements Tabuada {
    private int numero;

    public TabuadaSubtracao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        System.out.println("TABUADA SUBTRAÇÃO");
        for (int i = 0; i <= numero ; i++) {
            System.out.println(String.format("%d - %d = %d", numero, i, (numero - i) ));
        }
        System.out.println("==============================================");
    }
}
