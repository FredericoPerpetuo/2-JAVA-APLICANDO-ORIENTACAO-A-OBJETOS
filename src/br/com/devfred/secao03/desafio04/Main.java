package br.com.devfred.secao03.desafio04;


import br.com.devfred.secao03.desafio04.entities.GeradorPrimo;
import br.com.devfred.secao03.desafio04.entities.NumerosPrimos;
import br.com.devfred.secao03.desafio04.entities.VerificadorPrimo;

public class Main {
    public static void main(String[] args) {

        NumerosPrimos numerosPrimos = new NumerosPrimos();

        numerosPrimos.listarPrimos(100);

        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        verificadorPrimo.verificaSeEhPrimo(100);
        verificadorPrimo.verificaSeEhPrimo(123);
        verificadorPrimo.verificaSeEhPrimo(97);
        verificadorPrimo.verificaSeEhPrimo(29);

        GeradorPrimo geradorPrimo = new GeradorPrimo();
        System.out.println(String.format("%d atual - próximo primo: %d", 48, geradorPrimo.gerarProximoPrimo(48)));
        System.out.println(String.format("%d atual - próximo primo: %d", 79, geradorPrimo.gerarProximoPrimo(79)));
    }
}