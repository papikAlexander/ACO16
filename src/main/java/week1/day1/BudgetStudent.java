package week1.day1;

/**
 * Created by Alexander on 09.10.2016.
 */
public class BudgetStudent extends Student {

    private long scholarship;

    public long getScholarship() {
        return scholarship;
    }

    public void setScholarship(long scholarship) {
        this.scholarship = scholarship;
    }

    public BudgetStudent(String name, String surname, int age, double averageMark, long scholarship) {
        super(name, surname, age, averageMark);
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return super.toString() + " BudgetStudent{" +
                "scholarship=" + scholarship +
                '}';
    }

    public BudgetStudent clone() throws CloneNotSupportedException{
        return (BudgetStudent) super.clone();
    }
}
