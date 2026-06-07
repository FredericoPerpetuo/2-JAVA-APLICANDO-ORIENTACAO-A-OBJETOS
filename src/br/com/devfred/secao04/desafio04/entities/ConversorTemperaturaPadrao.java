package br.com.devfred.secao04.desafio04.entities;

import br.com.devfred.secao04.desafio04.interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double tempCelsius) {
        return (tempCelsius * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double tempFahreinheit) {
        return ((tempFahreinheit - 32) * 5) / 9;
    }
}
