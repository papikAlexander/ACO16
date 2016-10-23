package week3.day1;
/**
 * Created by Alexander on 22.10.2016.
 */
public class ColorPoint  extends Point{
    private int x;
    private int y;
    Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ColorPoint that = (ColorPoint) o;

        if (x != that.x) return false;
        if (y != that.y) return false;
        return color == that.color;

    }*/

    @Override
    public String toString() {
        return "ColorPoint{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
}
