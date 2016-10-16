package week2.home;

/**
 * Created by Alexander on 14.10.2016.
 */
public class LukKang extends Fighter {
    public LukKang(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void hit(Fighter fighter) {
        fighter.health -= damage;
        System.out.println(fighter.health);
    }

}
