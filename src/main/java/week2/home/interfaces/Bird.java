package week2.home.interfaces;

/**
 * Created by Alexander on 14.10.2016.
 */
public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("I can fly, I have wings");
    }
}
