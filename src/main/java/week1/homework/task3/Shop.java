package week1.homework.task3;

/**
 * Created by Alexander on 25.10.2016.
 */
public class Shop {
    public static void main(String[] args) {
        Flower rose = new Rose(40, 2, 50);
        Flower rose2 = new Rose(30, 5, 30);
        Flower chrysanthemum = new Chrysanthemum(20, 4, 25);
        Flower tulip = new Tulip(20, 1, 35);

        Bouquet bouquet = new Bouquet(4, 3);
        bouquet.flowers.add(rose);
        bouquet.flowers.add(rose2);
        bouquet.flowers.add(chrysanthemum);
        bouquet.flowers.add(tulip);


        System.out.println(bouquet);

        bouquet.sortByFresh(new FreshComparator());

        System.out.println(bouquet.price());

        System.out.println(bouquet);
        System.out.println(bouquet.findFlowerByLength(25));
        System.out.println(bouquet.findFlowerByLength(40, 51));
    }
}
