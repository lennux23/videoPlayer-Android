package lennux.com.mx.videoplayer.models;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

import lennux.com.mx.videoplayer.R;

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

    public static ArrayList<Artist> getArtists(Context context){
        ArrayList<Artist> listArtist= new ArrayList<Artist>();
        listArtist.add(new Artist("Julion Alvarez","Banda", context.getResources().getDrawable(R.mipmap.banda_ico)));


        return listArtist;

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
