package week5.day1.clone;

/**
 * Created by Alexander on 05.11.2016.
 */
public class Man extends Person{

    private Woman wife;

    @Override
    public Man clone() throws CloneNotSupportedException {

        Man man = (Man) super.clone();

        man.setWife(wife.clone());
        return man;
    }

    @Override
    public String toString() {
        return "Man{" +
                "wife=" + wife +
                '}' + super.toString();
    }

    public Woman getWife() {
        return wife;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
    }

    public Man(String name, int age, Woman wife) {

        super(name, age);
        this.wife = wife;
    }

    public Man(String name, int age) {
        super(name, age);
    }
}
