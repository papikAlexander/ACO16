package design_patterns.decorator;

/**
 * Created by Alexander on 06.11.2016.
 */
public class Chocolate {
    private final int COST = 5;
    private Selection selection;

    public Selection getSelection() {
        return selection;
    }

    public void setSelection(Selection selection) {
        this.selection = selection;
    }

    public Chocolate(){
    }

    public int getCost() {
        return COST;
    }
}
