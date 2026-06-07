package br.com.devfred.audiomatch.entities;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public Podcast(String titulo, String host, String descricao) {
        super(titulo);
        this.host = host;
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() >= 500){
            return 10;
        }else if(this.getTotalCurtidas() >= 300 && this.getTotalCurtidas() < 500){
            return 8;
        }else {
            return 6;
        }
    }
}
