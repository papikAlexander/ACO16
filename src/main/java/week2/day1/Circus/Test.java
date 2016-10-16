package week2.day1.Circus;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        Circus circus = new Circus("Kobzov");
        Clown clown = new Clown("Clown");
        Artist artist  = new Acrobat("Acrobat");
        Artist artist2 = new ClownRopeWalking("ClownRope");
        Artist artist3 = new Mime("Mime");
        circus.addArtist(clown);
        circus.addArtist(artist2);
        circus.addArtist(artist);
        circus.addArtist(artist2);
        circus.addArtist(artist3);
        System.out.println(circus);
        circus.sort(new NameComparator());
        System.out.println(circus);
        circus.act();
        clown.loath();
    }
}
