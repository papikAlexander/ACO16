package week5.day1.clone;

/**
 * Created by Alexander on 05.11.2016.
 */
public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Woman woman = new Woman("Eva", 30);
        Man man = new Man("John", 25, woman);
        Child child = new Child("Abel", 15);
        woman.setChild(child);
        Man clone = man.clone();

        System.out.println("Man - " + man);
        System.out.println("Clone - " + clone);

        man.setName("Jack");
        System.out.println("++++++++++");
        System.out.println("Man - " + man);
        System.out.println("Clone - " + clone);

        man.getWife().setName("Angelika");
        System.out.println("++++++++++");
        System.out.println("Man - " + man);
        System.out.println("Clone - " + clone);

        child.setName("Kain");
        System.out.println("++++++++++");
        System.out.println("Man - " + man);
        System.out.println("Clone - " + clone);
    }
}
