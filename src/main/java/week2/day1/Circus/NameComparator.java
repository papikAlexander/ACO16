package week2.day1.Circus;

import java.util.Comparator;

/**
 * Created by Alexander on 16.10.2016.
 */
public class NameComparator implements Comparator<Artist> {

    @Override
    public int compare(Artist artist1, Artist artist2) {
        return artist1.name.compareTo(artist2.name);
    }
}
