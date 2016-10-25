package week1.homework.task3;

/**
 * Created by Alexander on 25.10.2016.
 */
public class Accessory {
    private int accessory;
    private int number;

    public Accessory(int number) {

        this.number = number;
    }

    public Accessory(int accessory, int number) {
        this.accessory = accessory;
        this.number = number;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAccessory() {
        return accessory;
    }

    public void setAccessory(int length) {
        this.accessory = length;
    }


}
