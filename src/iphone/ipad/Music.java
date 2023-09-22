package iphone.ipad;

import java.util.Comparator;

public class Music implements Comparator<Music> {

    private String name;

    private String artist;

    private String album;
    private boolean playing;

    public Music(String name, String artist, String album, boolean playing) {
        this.name =name;
        this.artist = artist;
        this.album = album;
        this.playing = playing;
    }

    public Music(String music, String artist, String album) {
        this.name = music;
        this.artist = artist;
        this.album = album;
        this.playing = false;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    protected boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public String toString() {
        return "Music{" +
                "music='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", playing=" + playing +
                '}';
    }

    @Override
    public int compare(Music m1, Music m2) {
        return m1.getName().compareTo(m2.getName());
    }
}


