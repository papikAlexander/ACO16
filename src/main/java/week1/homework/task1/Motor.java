package week1.homework.task1;

/**
 * Created by Alexander on 23.10.2016.
 */
public class Motor {
    private double power;
    private double consumption;

    @Override
    public String toString() {
        return "Motor{" +
                "power=" + power +
                ", consumption=" + consumption +
                '}';
    }

    public Motor(double power, double consumption) {
        this.power = power;
        this.consumption = consumption;
    }
}
