package week3.day2.builder;

import org.junit.Before;

/**
 * Created by Alexander on 23.10.2016.
 */
public class Milk {
    private final String name;
    private final int volume;
    private final int proteins;
    private final int fats;
    private final int carbohydrates;
    private final int vitamins;
    private final int e;
    private final int color;

    @Override
    public String toString() {
        return "Milk{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", vitamins=" + vitamins +
                ", e=" + e +
                ", color=" + color +
                '}';
    }

    public Milk(Builder builder){
        this.name = builder.name;
        this.volume = builder.volume;
        this.proteins = builder.proteins;
        this.fats = builder.fats;
        this.carbohydrates = builder.carbohydrates;
        this.vitamins = builder.vitamins;
        this.e = builder.e;
        this.color = builder.color;
    }

    public static class Builder{
        private String name;
        private int volume;
        private int proteins;
        private int fats;
        private int carbohydrates;
        private int vitamins;
        private int e;
        private int color;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setVolume(int volume) {
            this.volume = volume;
            return this;
        }

        public Builder setProteins(int proteins) {
            this.proteins = proteins;
            return this;
        }

        public Builder setFats(int fats) {
            this.fats = fats;
            return this;
        }

        public Builder setCarbohydrates(int carbohydrates) {
            this.carbohydrates = carbohydrates;
            return this;
        }

        public Builder setVitamins(int vitamins) {
            this.vitamins = vitamins;
            return this;
        }

        public Builder setE(int e) {
            this.e = e;
            return this;
        }

        public Builder setColor(int color) {
            this.color = color;
            return this;
        }

        public Milk build(){
            return new Milk(this);
        }
    }
}
