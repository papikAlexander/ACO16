package week2.day1.Circus;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Mime extends Clown{

    public Mime(String name) {
        super(name);
    }

    @Override
    public void act(){
        System.out.println("I'm mime");
    }

    public void stand(){
        System.out.println("I'm stand");
    }
}
