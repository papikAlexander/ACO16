package week2.day1.Circus;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Clown extends Artist{

    public Clown(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println("I'm clown");
    }
    
    public void loath(){
        System.out.println("I'm joking");
    }
    
}
