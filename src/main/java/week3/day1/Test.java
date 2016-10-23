package week3.day1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 22.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        List<Point> point = new ArrayList<>();
        Point p1 = new Point(2, 5);
        ColorPoint cp = new ColorPoint(2, 5, Color.GREEN);
        ColorPoint cp2 = new ColorPoint(2, 5, Color.RED);
        point.add(p1);

        System.out.println(point.contains(cp));
        System.out.println(p1.equals(cp));
        System.out.println(cp.equals(cp2));
        System.out.println(p1.equals(cp2));
    }

}
