package week2.home.interfaces;

/**
 * Created by Alexander on 14.10.2016.
 */
public class Duck implements Flyable, Swimmable, Walkable{
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }

    @Override
    public void walk() {
        System.out.println("I can walk");
    }
}
