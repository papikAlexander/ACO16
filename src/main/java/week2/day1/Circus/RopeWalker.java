package week2.day1.Circus;

/**
 * Created by Alexander on 15.10.2016.
 */
public class RopeWalker extends Acrobat implements RopeWalking {
    public RopeWalker(String name) {
        super(name);
    }

    @Override
    public void ropeWalking() {
        System.out.println("I'm walk on the rope");
    }

    @Override
    public void act(){
        System.out.println("I'm Ropewalker");
    }
}
