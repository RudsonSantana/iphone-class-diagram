package iphone.ipad;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Music implements Comparable<Music> {

    private String name;

    private String artist;

    private String album;
    private boolean playing;

    public Music(String music, String artist, String album, boolean playing) {
        this.name = music;
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

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public int compareTo(Music m) {
        return name.compareTo(m.getName());
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
}
