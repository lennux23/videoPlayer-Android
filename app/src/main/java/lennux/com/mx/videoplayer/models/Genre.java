package lennux.com.mx.videoplayer.models;

import android.graphics.drawable.Drawable;

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
