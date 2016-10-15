package week2.day1.Circus;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Dealership extends Artist{

    public Dealership(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println("I'm dealership");
    }
}
