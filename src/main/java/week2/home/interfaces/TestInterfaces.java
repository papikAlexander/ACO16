package week2.home.interfaces;

/**
 * Created by Alexander on 14.10.2016.
 */
public class TestInterfaces {
    public static void main(String[] args) {

        Walkable aut = new Aut();
        Flyable bird = new Bird();
        Swimmable fish = new Fish();

        Duck duck = new Duck();


        Ocean ocean = new Ocean(fish);
        Earth earth = new Earth(aut);
        Sky sky = new Sky(bird);
        Sky sky1 = new Sky(duck);

        duck.walk();
    }
}
