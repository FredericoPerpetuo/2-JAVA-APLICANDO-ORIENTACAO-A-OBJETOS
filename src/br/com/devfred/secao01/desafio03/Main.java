package br.com.devfred.secao01.desafio03;


import br.com.devfred.secao01.desafio03.entities.Musica;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica("Carry on", "Angra", 1993);

        musica.avalia(8.5);
        musica.avalia(9.0);
        musica.avalia(10.0);

        System.out.println(musica.getFichaTecnica());
        System.out.println(String.format("Média de avalições: %.2f", musica.getMediaAvaliacoes()));
    }
}