package week1.homework.task3;

/**
 * Created by Alexander on 25.10.2016.
 */
public class Tulip extends Flower{

    @Override
    public String toString() {
        return "Tulip{Cost - " + cost + "; Days after cut tulip " + getFresh() + "; Length - " + getLength() + "}";
    }

    public Tulip(int cost, int afterCutDay, int length) {
        super(cost, afterCutDay, length);
    }

    @Override
    public void price() {
        System.out.printf("Tulip cost - %d UAH" + this.cost);
    }
}
