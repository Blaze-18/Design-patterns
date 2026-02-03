package advancemedia;

public class MP4Player implements AdvancedMediaPlayer{

    @Override
    public void play(String fileName, String fileType) {
        if(fileType.equalsIgnoreCase("mp4")){
            System.out.println("Playing: " + fileName + "." + fileType);
        }
    }
}
