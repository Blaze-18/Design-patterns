package advancemedia;

public class VLCPlayer implements AdvancedMediaPlayer{

    @Override
    public void play(String fileName, String fileType) {
        if(fileType.equalsIgnoreCase("VLC")){
            System.out.println("Playing: " + fileName + "." + fileType);
        }
    }
}
