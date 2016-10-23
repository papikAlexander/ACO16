package week3.day2.builder;

/**
 * Created by Alexander on 23.10.2016.
 */
public class TestBuilder {
    public static void main(String[] args) {
        Milk.Builder builder = new Milk.Builder().setName("Agusha").setColor(333);
        Milk milk = builder.setE(235).setCarbohydrates(15).setFats(50).setProteins(13).setVitamins(25).setVolume(1000).build();
        System.out.println(milk);
    }
}
