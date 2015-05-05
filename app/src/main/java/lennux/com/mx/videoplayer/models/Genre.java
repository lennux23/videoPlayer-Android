package lennux.com.mx.videoplayer.models;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

import lennux.com.mx.videoplayer.R;

/**
 * Created by mobilestudio06 on 27/04/15.
 */
public class Genre {

    private String genre;
    private Drawable icon;

    public Genre(String genre, Drawable icon) {
        this.genre = genre;
        this.icon = icon;
    }

    public static ArrayList<Genre> getGenre(Context context){
        ArrayList<Genre> listGenre = new ArrayList<Genre>();
        listGenre.add(new Genre("Banda", context.getResources().getDrawable(R.mipmap.banda_ico)));
        listGenre.add(new Genre("Electronica", context.getResources().getDrawable(R.mipmap.electronic_ico)));
        listGenre.add(new Genre("Pop", context.getResources().getDrawable(R.mipmap.pop_ico)));
        listGenre.add(new Genre("Salsa", context.getResources().getDrawable(R.mipmap.salsa_ico)));

        return listGenre;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }
}
