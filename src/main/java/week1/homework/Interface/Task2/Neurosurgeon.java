package week1.homework.Interface.Task2;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Neurosurgeon extends Surgeon {
    public Neurosurgeon(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.printf("I'm doctor, my name is %s and I work", getName());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Doctor Neurosurgeon{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    @Override
    public void salary() {
        System.out.printf("My salary is %d$", getSalary());
        System.out.println();
    }
}
