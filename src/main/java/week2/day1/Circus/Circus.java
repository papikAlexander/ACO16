package week2.day1.Circus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Circus {
    String name;
    public ArrayList<Artist> artists = new ArrayList<>();

    public Circus(String name) {
        this.name = name;
    }

    public boolean addArtist(Artist artist){
        return this.artists.add(artist);
    }
    public void act(){
        for (int i = 0; i < artists.size(); i++) {
            artists.get(i).act();
        }

    }

    @Override
    public String toString() {
        return "Circus{" +
                "name='" + name + '\'' +
                ", artists=" + artists +
                '}';
    }

    public void sort(Comparator comparator){
        artists.sort(comparator);
    }
}
