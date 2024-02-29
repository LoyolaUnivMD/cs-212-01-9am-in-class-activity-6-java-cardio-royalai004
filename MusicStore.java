public class MusicPlayer {
    // Attributes
    String brand;       // The brand of the music player
    String currentSong; // The currently playing song
    int volume;         // The current volume level of the music player

    // Constructor
    public MusicPlayer(String brand, String currentSong, int volume) {
        this.brand = brand;
        this.currentSong = currentSong;
        this.volume = 50; // Default volume set to 50
    }

    // Method to play a song
    public String playSong(String song) {
        this.currentSong = song;
        return "Playing: " + currentSong;
    }

    // Method to adjust volume
    public int adjustVolume(boolean increase) {
        if (increase) {
            if (volume < 100) { // Volume cannot exceed 100
                volume++;
            }
        } else {
            if (volume > 0) {  // Volume cannot be less than 0
                volume--;
            }
        }
        return volume;
    }

    // Method to display information
    public String displayInfo() {
        return "Current song: " + currentSong + ", Brand: " + brand + ", Volume: " + volume;
    }
}

public class MusicStore {
    public static void main(String[] args) {

        //Make a new music player for both
        MusicPlayer Player1 = new MusicPlayer("BrandA", null, 50);
        MusicPlayer Player2 = new MusicPlayer("BrandB", null, 50);

        //print out the info for the first musicplayer
        System.out.println("Player1 Information");
        System.out.println(Player1.displayInfo());
        System.out.println(" ");

        //print out the info for the second musicplayer
        System.out.println("Player2 Information");
        System.out.println(Player2.displayInfo());
        System.out.println(" ");
    }
}
