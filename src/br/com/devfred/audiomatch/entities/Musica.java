package br.com.devfred.audiomatch.entities;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public Musica(String titulo, String album, String artista, String genero) {
        super(titulo);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() >= 2000){
            return 10;
        }else if(this.getTotalReproducoes() >= 1000 && this.getTotalReproducoes() < 2000){
            return 8;
        }else {
            return 4;
        }
    }
}
