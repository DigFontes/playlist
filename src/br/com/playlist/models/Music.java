package br.com.playlist.models;

public class Music extends Audio{

    private String album;
    private String singer;
    private String styles;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getStyles() {
        return styles;
    }

    public void setStyles(String styles) {
        this.styles = styles;
    }

    @Override
    public int getClassifier() {
        if (this.getTotalPlays() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
