package week2.day1.Circus;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Tamer extends Artist{

    public Tamer(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println("I'm tamer");
    }
}
