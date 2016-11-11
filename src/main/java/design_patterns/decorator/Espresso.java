package design_patterns.decorator;

/**
 * Created by Alexander on 06.11.2016.
 */
public class Espresso {
    private String name;
    private final int COST = 10;

    Milk milk;
    Chocolate chocolate;
    Sugar sugar;

    public Espresso(String name, Milk milk, Chocolate chocolate, Sugar sugar) {
        this.name = name;
        this.milk = milk;
        this.chocolate = chocolate;
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "name='" + name + '\'' +
                ", COST=" + COST +
                '}';
    }

    public void printPrice(){
        if (milk.getSelection() == Selection.YES) System.out.println("Price with milk - " + (COST + milk.getCost()));
        else if (chocolate.getSelection() == Selection.YES) System.out.println("Price with chocolate - " + (COST + chocolate.getCost()));
    }

}
