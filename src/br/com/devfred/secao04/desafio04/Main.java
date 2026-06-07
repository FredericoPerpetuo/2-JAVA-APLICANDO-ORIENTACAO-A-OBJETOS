package br.com.devfred.secao04.desafio04;

import br.com.devfred.secao04.desafio04.entities.ConversorTemperaturaPadrao;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao ctp = new ConversorTemperaturaPadrao();

        double tempCelsius = 36.0;
        System.out.println(String.format("%.2f°C = %.2f°F", tempCelsius, ctp.celsiusParaFahrenheit(tempCelsius)));

        double tempFhrenheit = 70.0;
        System.out.println(String.format("%.2f°C = %.2f°F", tempFhrenheit, ctp.fahrenheitParaCelsius(tempFhrenheit)));
    }
}
