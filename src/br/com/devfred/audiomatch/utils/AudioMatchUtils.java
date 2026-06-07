package br.com.devfred.audiomatch.utils;

import br.com.devfred.audiomatch.entities.Audio;

public class AudioMatchUtils {

    public static void simulaReproducoes(Audio audio, int iteracoes){
        for (int i = 0; i < iteracoes; i++) {
            audio.reproduzir();
        }
    }

    public static void simulaCurtidas(Audio audio, int iteracoes){
        for (int i = 0; i < iteracoes; i++) {
            audio.curtir();
        }
    }
}
