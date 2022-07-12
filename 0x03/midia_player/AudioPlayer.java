package midia_player;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {

        if (tipoMedia == TipoMedia.MP3) {
            System.out.print("Reproduzindo MP3: " + nome);
        } else {

            //MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(tipoMedia);
            System.out.print("Reproduzindo " + tipoMedia + ": " + nome);
        }


    }
}
