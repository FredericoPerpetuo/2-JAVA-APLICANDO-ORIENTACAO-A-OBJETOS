package br.com.devfred.audiomatch.entities;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public Audio(String titulo){
        this.titulo = titulo;
    }

    public void curtir(){
        totalCurtidas++;
    }

    public void reproduzir(){
        totalReproducoes++;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public String getTitulo() {
        return titulo;
    }
}
