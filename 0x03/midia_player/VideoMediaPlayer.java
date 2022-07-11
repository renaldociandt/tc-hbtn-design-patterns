

public class VideoMediaPlayer implements AdvancedMediaPlayer{


    @Override
    public void reproduzirVlc(String nome) {
        System.out.println("Reproduzindo VLC: " + nome);

    }

    @Override
    public void reproduzirMP4(String nome) {
        System.out.println("Reproduzindo MP4: " + nome);

    }
}
