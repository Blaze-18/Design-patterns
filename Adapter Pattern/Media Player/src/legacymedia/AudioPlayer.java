package legacymedia;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String fileName, String fileType) {
        if(fileType.equalsIgnoreCase("mp3")){
            System.out.println("Playing:" + fileName + "." + fileType);
        } else if (fileType.equalsIgnoreCase("mp4") || fileType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileName, fileType);
        }

        else{
            throw new RuntimeException("Invalid file type");
        }

    }
}
