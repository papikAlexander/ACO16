package week1.day1;

import java.util.Arrays;

/**
 * Created by Alexander on 09.10.2016.
 */
public class University {
    private String name;
    private Group[] groups;
    private int groupCount;

    public University(String name, int universeSize) {
        this.name = name;
        this.groups = new Group[universeSize];
    }

    public boolean addGroup(Group group){
        for (int i = 0; i < groupCount; i++) {
            if(group.equals(groups[i]))
                return false;
        }
        if (group == null || groupCount == groups.length) return false;
        groups[groupCount++] =  group;
        return true;
    }

    public Group[] getGroups() {
        return groups;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean deleteGroup(String names){

        if (names == null) return false;
        for (int i = 0; i < groupCount; i++) {
            if (names.equals(groups[i].getName())) {
                System.arraycopy(groups, i + 1, groups, i, groupCount - i - 1);
                groups[--groupCount] = null;
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
