package design_patterns.adapter;

/**
 * Created by Alexander on 06.11.2016.
 */
public class TestCity {

    public static void main(String[] args) {
        PoliceDepartment department = new PoliceDepartment();

        Policeman policeman = new Policeman();
        Policeman policeman2 = new Policeman();
        Policeman policeman3 = new Policeman();

        Militioner militioner = new Militioner();
        Militioner militioner2 = new Militioner();
        Militioner militioner3 = new Militioner();

        department.hirePoliceman(policeman);
        department.hirePoliceman(policeman2);
        department.hirePoliceman(policeman3);
        department.hirePoliceman(new PolocemanAdapter(militioner));
        department.hirePoliceman(new PolocemanAdapter(militioner2));
        department.hirePoliceman(new PolocemanAdapter(militioner3));

    }


}
