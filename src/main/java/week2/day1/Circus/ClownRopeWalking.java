package week2.day1.Circus;

/**
 * Created by Alexander on 15.10.2016.
 */
public class ClownRopeWalking extends Clown implements RopeWalking {
    public ClownRopeWalking(String name) {
        super(name);
    }

    @Override
    public void ropeWalking() {
        System.out.println("I'm walk on the rope and I'm lough them");
    }
    @Override
    public void act(){
        System.out.println("I'm Clown-RopeWalker");
    }
}
