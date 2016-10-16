package week1.homework.task2;

/**
 * Created by Alexander on 11.10.2016.
 */
public class Owner {
    public static void main(String[] args) {
        Animal dog  = new Dog("Dog", "Spake", "he");
        Animal pappy = new Pappy("Taksa", "Dogger", "he");
        System.out.println(dog);
        dog.bit("cat");
        dog.speak();
        dog.run();
        dog.jump();
        System.out.println(pappy);
        pappy.bit("fox");
        pappy.speak();

    }
}
