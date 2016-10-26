package week1.homework.task3;

/**
 * Created by Alexander on 25.10.2016.
 */
public class Accessory {
    private int ribbonQuantity;
    private int costRibbon;
    private int costBoxing;

    public Accessory(int ribbonQuantity, int costRibbon, int costBoxing) {
        this.ribbonQuantity = ribbonQuantity;
        this.costRibbon = costRibbon;
        this.costBoxing = costBoxing;
    }

    public int cost(){
        return this.costRibbon * this.ribbonQuantity + this.costBoxing;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "ribbonQuantity=" + ribbonQuantity +
                "; boxing}";
    }

    public int getRibbonQuantity() {
        return ribbonQuantity;
    }

    public void setRibbonQuantity(int ribbonQuantity) {
        this.ribbonQuantity = ribbonQuantity;
    }

    public int getCostRibbon() {
        return costRibbon;
    }

    public void setCostRibbon(int costRibbon) {
        this.costRibbon = costRibbon;
    }

    public int getCostBoxing() {
        return costBoxing;
    }

    public void setCostBoxing(int costBoxing) {
        this.costBoxing = costBoxing;
    }


}
