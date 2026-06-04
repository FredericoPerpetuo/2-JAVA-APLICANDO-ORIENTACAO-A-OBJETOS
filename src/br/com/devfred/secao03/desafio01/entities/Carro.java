package br.com.devfred.secao03.desafio01.entities;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public Carro(String modelo, double precoAno1, double precoAno2, double precoAno3) {
        this.modelo = modelo;
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }
    
    public double getMaiorPreco(){
        double maiorPreco = 0.0;
        if(precoAno1 > precoAno2 && precoAno1 > precoAno3){
            maiorPreco = precoAno1;
        }else if(precoAno2 > precoAno1 && precoAno2 > precoAno3){
            maiorPreco = precoAno2;
        }else{
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    public double getMenorPreco(){
        double menorPreco = 0.0;
        if(precoAno1 < precoAno2 && precoAno1 < precoAno3){
            menorPreco = precoAno1;
        }else if(precoAno2 < precoAno1 && precoAno2 < precoAno3){
            menorPreco = precoAno2;
        }else{
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    @Override
    public String toString() {
        return """
        MODELO: %s
        PREÇO ANO 1: R$%.2f
        PREÇO ANO 2: R$%.2f
        PREÇO ANO 3: R$%.2f""".formatted(modelo, precoAno1, precoAno2, precoAno3);
    }
}
