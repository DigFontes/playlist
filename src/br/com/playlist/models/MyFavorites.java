package br.com.playlist.models;

public class MyFavorites {

    public void isIn(Audio audio) {
        if(audio.getClassifier() >= 9) {
            System.out.println("Listners are really lovin " + audio.getTitle() + ". Enjoy your moment!");
        } else {
            System.out.println(audio.getTitle() + " is getting hot in listners's ears. Great choice!");
        }

    }

}
