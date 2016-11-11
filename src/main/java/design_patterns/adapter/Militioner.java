package design_patterns.adapter;

/**
 * Created by Alexander on 06.11.2016.
 */
public class Militioner {
    private String name;
    private String rank;

    public void takeBribes(){
        System.out.println("I'm bad a militioner");
    }

    public Militioner() {
    }

    public Militioner(String name, String rank) {

        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Militioner{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
