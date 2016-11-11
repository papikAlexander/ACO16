package design_patterns.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 06.11.2016.
 */
public class PoliceDepartment {
    private List<Policeman> policemen = new ArrayList<>();

    public PoliceDepartment(){

    }

    public boolean hirePoliceman(Policeman policeman){
        return policemen.add(policeman);
    }

}
