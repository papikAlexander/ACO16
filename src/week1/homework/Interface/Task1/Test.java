package week1.homework.Interface.Task1;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        Book edition = new Encyclopedia("Dinosaurs", 500);
        Book edition1 = new Directory("Phone numbers", 1500);

        edition.author();
        edition.edition();
        edition.price();
        edition.toString();

        edition1.author();
        edition1.edition();
        edition1.price();
        edition1.toString();

    }
}
