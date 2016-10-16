package week1.homework.task2;

/**
 * Created by Alexander on 11.10.2016.
 */
public abstract class Animal {
    private String kind;

    public Animal(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kind='" + kind + '\'' +
                '}';
    }

    public abstract void speak();

    public abstract void bit(String name);

    public abstract void run();

    public abstract void jump();
}
