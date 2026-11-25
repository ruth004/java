import java.util.ArrayList;

public class Mp3 {

    private ArrayList<String> songs = new ArrayList<>();

    private int currentSong = 0;
    private int volume = 50;
    private boolean isPlaying = false;

    public void addSong(String song){
        this.songs.add(song);
    }

    public String play() {
        if (isPlaying == false) {
            isPlaying = true;
            return "Now playing: " + songs.get(currentSong);
        } else {
            return "Music is already playing";
        }
    }

    public String pause() {
        if (isPlaying == true) {
            isPlaying = false;
            return "Music is paused";
        } else {
            return "Music is not playing";
        }
    }

    public String stop() {
        isPlaying = false;
        return "Music has stopped";
    }

    public String nextSong() {
        if (currentSong < songs.size() - 1) {
            currentSong++;
        } else {
            currentSong = 0;
        }

        return"Next song: " + songs.get(currentSong);
    }

    public String previousSong() {
        if (currentSong > 0) {
            currentSong--;
        } else {
            currentSong = songs.size() - 1;
        }

        return "Previous song: " + songs.get(currentSong);
    }

    public String increaseVolume() {
        if (volume < 100) {
            volume++;
            return "Volume: " + volume;
        } else {
            return "Volume is at maximum";
        }
    }

    public String decreaseVolume() {
        if (volume > 0) {
            volume--;
            return "Volume: " + volume;
        } else {
            return "Volume is at minimum";
        }
    }

    public String displaySong() {
        return "Current song: " + songs.get(currentSong);
    }

    public String displaySongs() {
        for(int index = 0; index < this.songs.size(); index++) {
            return (index + 1) + ". " + songs.get(index);
        }
        return "Available songs:";
    }

    public int getVolume() {
        return volume;
    }

    public String getCurrentSong() {
        return songs.get(currentSong);
    }

    public boolean getIsPlaying() {
        return isPlaying;
    }

    public void getPreviousSong() {
    }
}