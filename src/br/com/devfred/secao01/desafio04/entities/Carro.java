package br.com.devfred.secao01.desafio04.entities;

import java.time.LocalDate;

public class Carro {
    private String modelo;
    private String cor;
    private int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public int calculaIdade(){
        return  LocalDate.now().getYear() - ano;
    }

    public String getFichaTecnica(){
        return """
        MODELO: %s
        COR: %s
        ANO: %d""".formatted(modelo, cor, ano);
    }
}
