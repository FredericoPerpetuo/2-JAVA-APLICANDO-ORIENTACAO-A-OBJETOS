package br.com.devfred.secao04.desafio03.entities;

import br.com.devfred.secao04.desafio03.interfaces.Tabuada;

public class TabuadaDivisao implements Tabuada {
    private int numero;

    public TabuadaDivisao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        System.out.println("TABUADA DIVISÃO");
        for (int i = 1; i <= numero ; i++) {
            System.out.println(String.format("%d / %d = %d", numero, i, (numero / i) ));
        }
        System.out.println("==============================================");
    }
}
