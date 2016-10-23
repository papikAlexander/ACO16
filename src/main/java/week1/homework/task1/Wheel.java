package week1.homework.task1;

/**
 * Created by Alexander on 12.10.2016.
 */
public class Wheel {
    private String model;
    SeasonWheel seasonWheel;

    @Override
    public String toString() {
        return "Wheel{" +
                "model='" + model + '\'' +
                ", seasonWheel=" + seasonWheel +
                '}';
    }

    public Wheel(String model, SeasonWheel seasonWheel) {
        this.model = model;
        this.seasonWheel = seasonWheel;
    }
}
