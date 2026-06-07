package br.com.devfred.audiomatch.principal;

import br.com.devfred.audiomatch.entities.Musica;
import br.com.devfred.audiomatch.entities.Podcast;
import br.com.devfred.audiomatch.entities.Preferidas;
import br.com.devfred.audiomatch.utils.AudioMatchUtils;

public class Main {
    public static void main(String[] args) {
        Musica rebirth = new Musica("Rebirth", "Rebirth", "Angra", "Metal Melódico");
        AudioMatchUtils.simulaReproducoes(rebirth, 2000);

        Musica tgsoe = new Musica("The Greatest Show on Earth", "Endless Forms Most Beautifu", "Nightwish", "Metal Sinfônico");
        AudioMatchUtils.simulaReproducoes(tgsoe, 1000);

        Podcast amplifica = new Podcast("Amplifica", "Rafael Bittencourt",
                "Podcast no qual o guitarrais " +
                "Rafael Bittencourt da banda Agra recebe artistas de vários " +
                "gêneros musicias para bate-papos sobre música");

        Podcast papinhoTech = new Podcast("Pap1nho tech", "Gustavo Caetano",
                "Conteúdos de tecnologia com um pequenino toque de humor");
        AudioMatchUtils.simulaCurtidas(amplifica, 500);
        AudioMatchUtils.simulaCurtidas(papinhoTech, 300);


        Preferidas preferidas = new Preferidas();
        preferidas.inclui(rebirth);
        preferidas.inclui(tgsoe);
        preferidas.inclui(amplifica);
        preferidas.inclui(papinhoTech);
    }
}
