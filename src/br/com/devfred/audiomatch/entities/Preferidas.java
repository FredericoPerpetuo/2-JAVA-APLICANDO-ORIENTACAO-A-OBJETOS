package br.com.devfred.audiomatch.entities;

public class Preferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " está entre os mais ouvidos do momento");
        } else if (audio.getClassificacao() >= 8 && audio.getClassificacao() < 9){
            System.out.println(audio.getTitulo() + " é uma ótima opção para sua lista de favoritos");
        }else{
            System.out.println(audio.getTitulo() + " é uma opção para quando tiver um tempo livre");
        }
    }
}
