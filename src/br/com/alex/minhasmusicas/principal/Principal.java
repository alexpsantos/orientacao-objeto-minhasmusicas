package br.com.alex.minhasmusicas.principal;

import br.com.alex.minhasmusicas.modelo.Minhaspreferidas;
import br.com.alex.minhasmusicas.modelo.Musica;
import br.com.alex.minhasmusicas.modelo.Podcast;

public class Principal {

    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("Bolhadev");
        meuPodcast.setApresentador("Jack");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        Minhaspreferidas minhaspreferidas = new Minhaspreferidas();
        minhaspreferidas.incluir(meuPodcast);
        minhaspreferidas.incluir(minhaMusica);
    }
}
