package design_patterns.adapter;

/**
 * Created by Alexander on 06.11.2016.
 */
public class Policeman {
    private String name;
    private String rank;

    public void serve(){
        System.out.println("I'm good a policeman");
    }

    public Policeman() {
    }

    public Policeman(String name, String rank) {

        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Policeman{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
