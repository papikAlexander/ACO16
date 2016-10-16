package week2.day1.Circus;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Acrobat extends Artist{
    public Acrobat(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println("I'm acrobat");
    }
    
    public void trick(){
        System.out.println("I'm make trick on the trampoline");
    }
}
