package week1.day1;

import java.util.Arrays;

/**
 * Created by Alexander on 09.10.2016.
 */
public class University {
    private String name;
    private Group[] groups;
    private int universeCount;

    public University(String name, int universeSize) {
        this.name = name;
        this.groups = new Group[universeSize];
    }

    public boolean addGroup(Group group){
        if (group == null) return false;
        if (universeCount == groups.length) return false;
        groups[universeCount] =  group;
        universeCount++;
        return true;
    }

    public Group[] getGroups() {
        return groups;
    }

    public int getUniverseCount() {
        return universeCount;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean deleteGroup(String names){

        if (names == null) return false;
        for (int i = 0; i < universeCount; i++) {
            if (names.equals(groups[i].getName())) {
                groups[i] = null;
                System.arraycopy(groups, i + 1, groups, i, universeCount - i);
                /*students[i] = students[groupCount - 1];
                students[groupCount - 1] = null;*/
                universeCount--;
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
