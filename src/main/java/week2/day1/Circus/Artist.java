package week2.day1.Circus;

/**
 * Created by Alexander on 15.10.2016.
 */
public abstract class Artist {
    public String name;

    public Artist(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void act();
}
