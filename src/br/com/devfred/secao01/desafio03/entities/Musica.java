package br.com.devfred.secao01.desafio03.entities;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLançamento;
    private double avaliacao;
    private int numAvaliacoes;

    public Musica(String título, String artista, int anoLançamento) {
        this.titulo = título;
        this.artista = artista;
        this.anoLançamento = anoLançamento;
    }

    public void avalia(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    public Double getMediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }

    public String getFichaTecnica() {
        return """
        FICHA TÉCNICA
        Título: %s
        Artista: %s
        Ano de lançamento: %d""".formatted(titulo, artista, anoLançamento);
    }
}
