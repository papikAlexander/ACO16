package week1.homework.task3;

/**
 * Created by Alexander on 25.10.2016.
 */
public class Chrysanthemum extends Flower{

    @Override
    public String toString() {
        return "Chrysanthemum{Cost - " + cost + "; Days after cut chrysanthemum " + getFresh() + "; Length - " + getLength() + "}";
    }

    public Chrysanthemum(int cost, int afterCutDay, int length) {
        super(cost, afterCutDay, length);
    }

    @Override
    public void price() {
        System.out.printf("Chrysanthemum cost - %d UAH" + this.cost);
    }
}
