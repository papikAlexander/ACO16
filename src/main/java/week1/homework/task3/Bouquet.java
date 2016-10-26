package week1.homework.task3;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Alexander on 25.10.2016.
 */
public class Bouquet {

    public ArrayList<Flower> flowers;
    public Accessory accessory;
    private int length;
    private int number;

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers + "; accessory = "+ accessory +
                '}';
    }

    public Bouquet(int length, Accessory accessory) {
        this.accessory = accessory;
        this.length = length;
        flowers = new ArrayList<>();
    }

    public Bouquet(int length, int number, Accessory accessory) {
        this.accessory = accessory;
        this.length = length;
        this.number = number;
        flowers = new ArrayList<>(number);
    }

    public void sortByFresh(Comparator comparator){
        flowers.sort(comparator);
    }

    public String price(){
        int tmp = 0;
        for (int i = 0; i < flowers.size(); i++) {
            tmp += flowers.get(i).cost;
        }
        return "Bouquet cost - " + tmp * accessory.cost() + " UAN";
    }

    public Flower findFlowerByLength(int length){
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).getLength() == (length)) return flowers.get(i);
        }
        return null;
    }

    public Flower findFlowerByLength(int minLength, int maxLength){
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).getLength() >= minLength && flowers.get(i).getLength() < maxLength) return flowers.get(i);
        }
        return null;
    }
}
