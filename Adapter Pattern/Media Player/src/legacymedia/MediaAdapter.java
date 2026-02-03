package legacymedia;

import advancemedia.AdvancedMediaPlayer;
import advancemedia.MP4Player;
import advancemedia.VLCPlayer;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String fileType){
        if(fileType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new MP4Player();
        } else if (fileType.equalsIgnoreCase("VLC")) {
            advancedMediaPlayer = new VLCPlayer();
        }
    }
    @Override
    public void play(String fileName, String fileType) {
        if(fileType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.play(fileName, fileType);
        }else if(fileType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.play(fileName, fileType);
        }
    }
}
