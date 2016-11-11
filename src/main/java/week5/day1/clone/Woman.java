package week5.day1.clone;

import java.util.PrimitiveIterator;

/**
 * Created by Alexander on 05.11.2016.
 */
public  class Woman extends Person{

    private Child child;

    @Override
    public String toString() {
        return "Woman{" +
                "child=" + child +
                '}' + super.toString();
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Woman(String name, int age) {
        super(name, age);
    }
    public Woman clone() throws CloneNotSupportedException {
        Woman woman = (Woman) super.clone();
        woman.setChild(child.clone());
        return woman;
    }
}
