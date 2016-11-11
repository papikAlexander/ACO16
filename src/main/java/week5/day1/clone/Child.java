package week5.day1.clone;

/**
 * Created by Alexander on 05.11.2016.
 */
public class Child extends Person {
    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Child{" + super.toString() + "}";
    }

    @Override
    public Child clone() throws CloneNotSupportedException {

        return (Child) super.clone();
    }
}
