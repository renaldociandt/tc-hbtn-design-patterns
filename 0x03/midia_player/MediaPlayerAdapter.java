package midia_player;

public class MediaPlayerAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if (tipoMedia != TipoMedia.MP3) {
            this.advancedMediaPlayer = new VideoMediaPlayer();;
        }
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nome) {
        if (tipoMedia == TipoMedia.MP4){
            advancedMediaPlayer.reproduzirVlc(nome);
        }


    }

}
