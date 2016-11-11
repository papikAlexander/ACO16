package design_patterns.decorator;

/**
 * Created by Alexander on 06.11.2016.
 */
public class Milk {
    private final int COST = 3;
    private Selection selection;

    public Selection getSelection() {
        return selection;
    }

    public void setSelection(Selection selection) {
        this.selection = selection;
    }

    public Milk(){
    }

    public int getCost() {
        return COST;
    }
}
