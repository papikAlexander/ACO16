package library.library.model;

import library.library.enums.Access;

import java.util.ArrayList;

/**
 * Created by Alexander on 16.10.2016.
 */
public class Reader {
    private static final int MAX_BOOK = 3;
    private String name;

    public ArrayList<PeriodicalIssue> getIssue() {
        return issue;
    }

    private String surname;

    private ArrayList<PeriodicalIssue> issue = new ArrayList<>(MAX_BOOK);

    private Access blackList;

    public Reader(String name, String surname) {
        this.name = name;
        this.surname = surname;
        blackList = Access.FREE;
    }

    public boolean getBook(PeriodicalIssue issue){
        if(blackList == Access.FREE){
            if (this.issue.size() < MAX_BOOK){
                this.issue.add(issue);
            }
        }
        return false;
    }
    public boolean giveBook(PeriodicalIssue issue){
        for (int i = 0; i < this.issue.size(); i++) {
            if(issue.equals(this.issue.get(i))){
                this.issue.remove(i);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", issue=" + issue +
                ", blackList=" + blackList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reader = (Reader) o;

        if (name != null ? !name.equals(reader.name) : reader.name != null) return false;
        return surname != null ? surname.equals(reader.surname) : reader.surname == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Access getBlackList() {
        return blackList;
    }

    public void setBlackList(Access blackList) {
        this.blackList = blackList;
    }

}
