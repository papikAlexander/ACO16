package week1.day1;

/**
 * Created by Alexander on 09.10.2016.
 */
public class ContractStudent extends Student{

    private int period;

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public ContractStudent(String name, String surname, int age, double averageMark, int period) {
        super(name, surname, age, averageMark);
        this.period = period;
    }

    @Override
    public String toString() {
        return super.toString() + " ContractStudent{" +
                "period=" + period +
                '}';
    }
}
