package br.com.playlist.main;

import br.com.playlist.models.Music;
import br.com.playlist.models.MyFavorites;
import br.com.playlist.models.Podcast;

public class Main {

    public static void main(String[] args) {

        Music myMusic = new Music();
        myMusic.setTitle("Oceans");
        myMusic.setSinger("Hillsong United");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();

        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("FontesDev");
        myPodcast.setHost("Diego Fontes");

        for (int i = 0; i < 1000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 2030; i++) {
            myPodcast.like();

        }

        MyFavorites favorites = new MyFavorites();
        favorites.isIn(myMusic);
        favorites.isIn(myPodcast);
    }

}
