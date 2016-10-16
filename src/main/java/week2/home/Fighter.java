package week2.home;

/**
 * Created by Alexander on 14.10.2016.
 */
public abstract class Fighter {
    public int health = 100;
    private String name;
    public int damage;

    public Fighter(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name + " ";
    }

    public abstract void hit(Fighter fighter);

}
