package week1.homework.task3;

/**
 * Created by Alexander on 25.10.2016.
 */
public class Rose extends Flower {

    @Override
    public String toString() {
        return "Rose{Cost - " + cost + "; Days after cut rose " + getFresh() + "; Length - " + getLength() + "}";
    }

    public Rose(int cost, int afterCutDay, int length) {
        super(cost, afterCutDay, length);
    }

    @Override
    public void price() {
        System.out.printf("Rose cost - %d UAH" + this.cost);
    }
}
