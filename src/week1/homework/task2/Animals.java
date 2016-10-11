package week1.homework.task2;

/**
 * Created by Alexander on 11.10.2016.
 */
public class Animals {
    private String kind;

    public Animals(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "kind='" + kind + '\'' +
                '}';
    }
}
