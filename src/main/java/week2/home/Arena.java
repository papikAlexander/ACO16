package week2.home;

/**
 * Created by Alexander on 14.10.2016.
 */
public class Arena {
    private Fighter first;
    private Fighter second;

    public Arena(Fighter first, Fighter second) {
        this.first = first;
        this.second = second;
    }

    public void startFight(){

        while (first.health > 0 && second.health > 0){

            first.hit(second);
            System.out.printf("Fighter - %s hit fighter - %s health ", first.toString(), second.toString());
            if (second.health <= 0){
                System.out.println(first.toString() + "win!");
                break;
            }
            second.hit(first);
            System.out.printf("Fighter - %s hit fighter - %s health ", second.toString(), first.toString());
            if (first.health <= 0){
                System.out.println(second.toString() + "win!");
                break;
            }

        }
    }
}
