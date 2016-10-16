package week2.day2.library;

import java.util.ArrayList;

/**
 * Created by Alexander on 16.10.2016.
 */
public class Reader {
    private static final int MAX_BOOK = 3;
    private String name;
    private String surname;
    private ArrayList<PereodicalIssue> issue = new ArrayList<>(MAX_BOOK);
    private boolean isBlackList;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isBlackList() {
        return isBlackList;
    }

    public void setBlackList(boolean blackList) {
        isBlackList = blackList;
    }

    public Reader(String name, String surname, boolean isBlackList) {
        this.name = name;
        this.surname = surname;
        this.isBlackList = isBlackList;
    }

    public boolean getBook(PereodicalIssue issue){
        if(this.isBlackList == false){
            if (this.issue.size() < MAX_BOOK){
                this.issue.add(issue);
            }
        }
        return false;
    }
}
