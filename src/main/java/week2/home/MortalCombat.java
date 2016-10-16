package week2.home;

/**
 * Created by Alexander on 14.10.2016.
 */
public class MortalCombat {
    public static void main(String[] args) {
        Fighter fighter1 = new LukKang("Luck", 20);
        Fighter fighter2 = new Subzero("Sub", 15);
        Arena arena = new Arena(fighter1, fighter2);
        arena.startFight();

    }
}
