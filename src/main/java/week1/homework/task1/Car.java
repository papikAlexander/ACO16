package week1.homework.task1;

import myList.MyArrayList;

/**
 * Created by Alexander on 11.10.2016.
 */
public class Car {
    private String model;
    public MyArrayList wheels = new MyArrayList(4);
    private Motor motor;

    public Car(String model, Motor motor) {
        this.model = model;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", motor=" + motor +
                '}';
    }

    public void drive(){
        System.out.println(this.model + " start drive");
    }

    public void refuel(){
        System.out.println(this.model + " to refuel");
    }

    public void print(){
        System.out.println("Model car - " + this.model);
    }

    public void fixCar(){
        System.out.println("Start tire repairs");
    }
}
