package lennux.com.mx.videoplayer.models;

import android.graphics.drawable.Drawable;

/**
 * Created by mobilestudio06 on 27/04/15.
 */
public class Artist{
    private String nameArtist;
    private String nameGenre;
    private Drawable picArtist;

    public Artist(String nameArtist, String nameGenre, Drawable picArtist) {
        this.nameArtist = nameArtist;
        this.nameGenre = nameGenre;
        this.picArtist = picArtist;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public String getNameGenre() {
        return nameGenre;
    }

    public void setNameGenre(String nameGenre) {
        this.nameGenre = nameGenre;
    }

    public Drawable getPicArtist() {
        return picArtist;
    }

    public void setPicArtist(Drawable picArtist) {
        this.picArtist = picArtist;
    }
}
