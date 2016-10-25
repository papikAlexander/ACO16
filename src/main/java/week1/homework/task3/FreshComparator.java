package week1.homework.task3;

import java.util.Comparator;

/**
 * Created by Alexander on 25.10.2016.
 */
public class FreshComparator implements Comparator<Flower> {

    @Override
    public int compare(Flower o1, Flower o2) {
        return Integer.compare(o1.getFresh(), o2.getFresh());
    }
}
