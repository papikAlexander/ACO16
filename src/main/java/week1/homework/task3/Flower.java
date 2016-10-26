package week1.homework.task3;

/**
 * Created by Alexander on 25.10.2016.
 */
public abstract class Flower {

    protected int cost;
    private int fresh;
    private int length;

    public Flower(int cost, int fresh, int length) {
        this.cost = cost;
        this.fresh = fresh;
        this.length = length;
    }

    public abstract void price();

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFresh() {
        return fresh;
    }

}
