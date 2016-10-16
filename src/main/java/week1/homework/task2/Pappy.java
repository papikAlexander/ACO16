package week1.homework.task2;

/**
 * Created by Alexander on 11.10.2016.
 */
public class Pappy extends Dog {
    public Pappy(String kind, String name, String sex) {
        super(kind, name, sex);
    }

    @Override
    public String toString() {
        return super.toString() + "Pappy{}";
    }
    public void speak(){
        System.out.println("Gav!");
    }
    public void run(){
        System.out.printf("Go run %s\n", getName());
    }
    public void jump(){
        System.out.printf("Jump %s\n", getName());
    }
}
