package design_patterns.adapter;

/**
 * Created by Alexander on 06.11.2016.
 */
public class PolocemanAdapter extends Policeman {

    private Militioner militioner;

    public PolocemanAdapter(Militioner militioner) {
        this.militioner = militioner;
    }

    public PolocemanAdapter(String name, String rank, Militioner militioner) {
        super(name, rank);
        this.militioner = militioner;
    }

    public void serve(){
        militioner.takeBribes();
    }
}
