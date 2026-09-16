package atvEstudar.relacao.ex10;

import java.util.List;
import java.util.ArrayList;

public class Playlist {
    private String nomePlaylist;
    private List<Musica> musicas;

    public Playlist(String nomePlaylist){
        this.nomePlaylist=nomePlaylist;
        this.musicas=new ArrayList<>();
    }

    public void adicionarMusica(Musica musica){
        this.musicas.add(musica);
    }
}
