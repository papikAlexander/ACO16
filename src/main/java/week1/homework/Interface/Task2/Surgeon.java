package week1.homework.Interface.Task2;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Surgeon implements Doctor{

    private String name;
    private int salary;

    public Surgeon(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.printf("I'm doctor, my name is %s and I work", name);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override

    public String toString() {
        return "Doctor Surgeon{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void salary() {
        System.out.printf("My salary is %d$", salary);
        System.out.println();
    }
}
