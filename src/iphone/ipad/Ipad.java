package iphone.ipad;

import java.util.ArrayList;
import java.util.List;

public class Ipad {
    private List<Music> musicList;

    private Music music;

    public Ipad() {
        this.musicList = new ArrayList<>();
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public Music getMusic() {
        return music;
    }

    public void addMusic(String name, String artist, String album) {
        for (Music m : musicList) {
            if (m.getName().equals(name)) {
                return;
            }
        }
        music = new Music(name, artist, album);
        musicList.add(music);
        musicList.sort(music);
    }

    public void deleteMusic (String name) {
        List<Music> musicDeleted = new ArrayList<>();
        for (Music m: musicList) {
            if(m.getName().equals(name)) {
                musicDeleted.add(m);
            }
        }
        musicList.removeAll(musicDeleted);
    }

    public List<Music> searchMusic(String name) {
        List<Music> musicSearched = new ArrayList<>();
        if (!musicList.isEmpty()) {
            for (Music m: musicList) {
                if(m.getName().equalsIgnoreCase(name)) {
                    musicSearched.add(m);
                }
            }
        }
        return musicSearched;
    }

    public List<Music> searchArtist(String name) {
        List<Music> musicSearched = new ArrayList<>();
        if (!musicList.isEmpty()) {
            for (Music m: musicList) {
                if(m.getArtist().equalsIgnoreCase(name)) {
                    musicSearched.add(m);
                }
            }
        }
        return musicSearched;
    }

    public List<Music> searchAlbum(String name) {
        List<Music> musicSearched = new ArrayList<>();
        if (!musicList.isEmpty()) {
            for (Music m: musicList) {
                if(m.getAlbum().equalsIgnoreCase(name)) {
                    musicSearched.add(m);
                }
            }
        }
        return musicSearched;
    }



    // play
    public String play(String name) {
        List<Music> musicSearched = searchMusic(name);
        if (!musicSearched.isEmpty()) {
            Music musicToPlay = musicSearched.get(0);
            musicToPlay.setPlaying(true);
            return "Playing music: " + musicToPlay.getName() + " - " + musicToPlay.getArtist() + " - Album: " + musicToPlay.getAlbum();
        }
        return null;
    }

    // pause
    public String pause(String name) {
        List<Music> musicSearched = searchMusic(name);
        if (!musicSearched.isEmpty()) {
            Music musicToPause = musicSearched.get(0);
            musicToPause.setPlaying(false);
            return "Pause music: " + musicToPause.getName() + " - " + musicToPause.getArtist() + " - Album: " + musicToPause.getAlbum();
        }

        return null;
    }
}
