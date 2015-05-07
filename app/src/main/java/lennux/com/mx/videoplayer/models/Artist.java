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

    public static ArrayList<Artist> getArtists(Context context, String nameCategory){
        ArrayList<Artist> listArtist= new ArrayList<Artist>();
        switch (nameCategory){
            case "Banda":
                listArtist.add(new Artist("Julion Alvarez",nameCategory, context.getResources().getDrawable(R.mipmap.julion_alvarez)));
                break;
            case "Pop":
                listArtist.add(new Artist("Playa Limbo",nameCategory, context.getResources().getDrawable(R.mipmap.playa_limbo)));
                break;
            case "Electronica":
                listArtist.add(new Artist("Armin Van Buuren",nameCategory, context.getResources().getDrawable(R.mipmap.armin_van_buuren)));
                break;
            case "Salsa":
                listArtist.add(new Artist("Adolecentes Orquesta","nameCategory", context.getResources().getDrawable(R.mipmap.adolecentes)));
                break;
        }



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
