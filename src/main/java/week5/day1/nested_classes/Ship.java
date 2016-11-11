package week5.day1.nested_classes;

/**
 * Created by Alexander on 05.11.2016.
 */
public class Ship {

    public static class LifeBoat{
        private String name;

        public LifeBoat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "LifeBoat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public class Engine{
        private String name;

        public Engine(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
