package week1.homework.task2;

/**
 * Created by Alexander on 11.10.2016.
 */
public class Dog extends Animals {
    private String name;
    private String sex;

    public Dog(String kind, String name, String sex) {
        super(kind);
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return super.toString() + "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void bit(String name){
        if(name == null) {
            System.out.println("Wrong!");
            return;
        }
        System.out.printf("%s bit %s\n",this.name, name);

    }
    public void speak(){
        System.out.println("Gav!");
    }
    public void run(){
        System.out.printf("Go run %s\n", this.name);
    }
    public void jump(){
        System.out.printf("Jump %s\n", this.name);
    }
}
