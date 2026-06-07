package br.com.devfred.secao04.desafio03;

import br.com.devfred.secao04.desafio03.entities.TabuadaAdicao;
import br.com.devfred.secao04.desafio03.entities.TabuadaDivisao;
import br.com.devfred.secao04.desafio03.entities.TabuadaMultiplicacao;
import br.com.devfred.secao04.desafio03.entities.TabuadaSubtracao;

public class Main {
    public static void main(String[] args) {
        TabuadaSubtracao tb = new TabuadaSubtracao(10);
        tb.mostrarTabuada();

        TabuadaDivisao td = new TabuadaDivisao(10);
        td.mostrarTabuada();

        TabuadaMultiplicacao tm = new TabuadaMultiplicacao(10);
        tm.mostrarTabuada();

        TabuadaAdicao ta = new TabuadaAdicao(10);
        ta.mostrarTabuada();

    }
}
