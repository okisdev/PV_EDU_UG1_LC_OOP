import java.util.ArrayList;

public class Recording {

    private String songTitle;
    private String artist;
    private int playingTime;

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public Recording(String songTitle, String artist, int playingTime) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.playingTime = playingTime;
    }

}
