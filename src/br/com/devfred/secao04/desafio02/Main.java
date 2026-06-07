package br.com.devfred.secao04.desafio02;

import br.com.devfred.secao04.desafio02.entities.CalculadoraSalaRetangular;
import br.com.devfred.secao04.desafio02.interfaces.CalculoGeometrico;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular csr = new CalculadoraSalaRetangular(3.5, 10.5);
        System.out.println(String.format("Área = %.2f", csr.calcularArea()));
        System.out.println(String.format("Perimetro = %.2f", csr.calcularPerimetro()));

    }
}
