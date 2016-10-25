package week1.homework.task1;

/**
 * Created by Alexander on 23.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        Motor motor = new Motor(2.0, 9.8);

        Wheel wheell = new Wheel("Rosava", SeasonWheel.SUMMER);
        Wheel wheel2 = new Wheel("Rosava", SeasonWheel.SUMMER);
        Wheel wheel3 = new Wheel("Rosava", SeasonWheel.SUMMER);
        Wheel wheel4 = new Wheel("Rosava", SeasonWheel.SUMMER);

        Car car = new Car("BMW", motor);
        car.wheels.add(wheell);
        car.wheels.add(wheel2);
        car.wheels.add(wheel3);
        car.wheels.add(wheel4);

        System.out.println(car);
        car.drive();
        car.refuel();
        car.fixCar();
        car.print();

    }
}
