package week5.day1.nested_classes;

/**
 * Created by Alexander on 05.11.2016.
 */
public class ShipTest {
    public static void main(String[] args) {
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat("Boat");

        Ship.Engine engine = new Ship().new Engine("Engine");

    }
}
