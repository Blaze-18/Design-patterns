import legacymedia.AudioPlayer;

public class Main {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();


        System.out.println("Audio File playing Demo");
        audioPlayer.play("Song1", "mp3");
        System.out.println("MP4 File playing Demo");
        audioPlayer.play("Movie1", "mp4");
        System.out.println("VLC File playing Demo");
        audioPlayer.play("Movie2", "vlc");
        System.out.println("Random File demo");
        audioPlayer.play("Hello", "txt");

    }
}