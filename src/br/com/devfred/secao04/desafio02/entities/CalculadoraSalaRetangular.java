package br.com.devfred.secao04.desafio02.entities;

import br.com.devfred.secao04.desafio02.interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private double altura;
    private double largura;

    public CalculadoraSalaRetangular(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * altura + 2 * largura;
    }
}
