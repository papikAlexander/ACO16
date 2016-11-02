package week2.day2.library.conroller;

import week2.day2.library.comparators.ComparatorIssueByName;
import week2.day2.library.comparators.ComparatorReaderByName;
import week2.day2.library.config.ApplicationContext;
import week2.day2.library.dao.IssueDao;
import week2.day2.library.dao.ReaderDao;
import week2.day2.library.enums.Access;
import week2.day2.library.enums.Genre;
import week2.day2.library.model.PeriodicalIssue;
import week2.day2.library.model.Reader;

import java.util.ArrayList;

/**
 * Created by Alexander on 16.10.2016.
 */
public class Library {

    private String name;
    private ApplicationContext context;
    private ReaderDao readerDao;
    private IssueDao issueDao;
    private ArrayList<Reader> readers;
    private ArrayList<PeriodicalIssue> issues;

    public Library(String name) {
        context = ApplicationContext.getInstance();
        this.name = name;
        readerDao = context.getReaderDao();
        issueDao = context.getIssueDao();
    }

    public boolean addReader(Reader reader){
        if (reader == null) return false;
        return readerDao.addReader(reader);
    }

    public boolean deleteReader(String name, String surname){
        if (name == null || surname == null) return false;
        return readerDao.deleteReader(name, surname);
    }

    public Reader getReader(String name, String surname){
        if (name == null || surname == null) return null;
        return readerDao.getReader(name, surname);
    }
    public boolean findReader(String name, String surname){
        if (name == null || surname == null) return false;
        return readerDao.findReader(name, surname);
    }

    public boolean addIssue(PeriodicalIssue issue){
        if (issue == null) return false;
        return issueDao.addIssue(issue);
    }

    public boolean deleteIssue(String name, int year, String author, Genre genre){
        if (name == null || year == 0 || author == null || genre == null) return false;
        return issueDao.deleteIssue(name, year, author, genre);
    }

    public PeriodicalIssue getIssue(String name, int year, String author, Genre genre){
        if (name == null || year == 0 || author == null || genre == null) return null;
        return issueDao.getIssue(name, year, author, genre);
    }
    public boolean findIssue(String name, int year, String author, Genre genre){
        if (name == null || year == 0 || author == null || genre == null) return false;
        return issueDao.findIssue(name, year, author, genre);
    }

    public void printReaders(){

        readers = readerDao.printReaders();
        readers.sort(new ComparatorReaderByName());
        System.out.println(readers);

    }

    public void printIssueFree(){

        issues = issueDao.printIssueFree();
        issues.sort(new ComparatorIssueByName());
        System.out.println(issues);

    }

    public void printIssueBusy(){

        issues = issueDao.printIssueBusy();
        issues.sort(new ComparatorIssueByName());
        System.out.println(issues);

    }

    public boolean giveIssueToReader(PeriodicalIssue issue, Reader reader) {

        Reader tmpReader = getReader(reader.getName(), reader.getSurname());
        PeriodicalIssue tmpIssue = getIssue(issue.getName(), issue.getYear(), issue.getAuthor(), issue.getGenre());

        if (tmpIssue == null || tmpIssue.getAccess() == Access.BUSY){
            System.out.println("Not found book!");
            return false;

        } else if (tmpReader == null || tmpReader.getBlackList() == Access.BUSY){
            System.out.println("Not found reader!");
            return false;

        } else {
            tmpIssue.setAccess(Access.BUSY);
            tmpReader.getBook(tmpIssue);
            return true;
        }
    }

    public boolean inBlackList(Reader reader){

        Reader tmpReader = getReader(reader.getName(), reader.getSurname());

        if (tmpReader == null) return false;

        if (tmpReader.getBlackList() == Access.BUSY){
            System.out.println("This reader already there");
            return false;
        }

        tmpReader.setBlackList(Access.BUSY);
        return true;
    }

    public boolean asBlackList(Reader reader){

        Reader tmpReader = getReader(reader.getName(), reader.getSurname());

        if (tmpReader == null) return false;

        if (tmpReader.getBlackList() == Access.FREE){
            System.out.println("This reader not present in black list ");
            return false;
        }

        tmpReader.setBlackList(Access.FREE);
        return true;
    }

    public boolean showIssueInReader(Reader reader){

        ArrayList<PeriodicalIssue> tmp = new ArrayList<>();
        Reader tmpReader = getReader(reader.getName(), reader.getSurname());

        if (tmpReader == null) return false;

        System.out.println("This reader have books:");

        for (int i = 0; i < tmpReader.getIssue().size(); i++) {
            tmp.add(tmpReader.getIssue().get(i));
        }

        tmp.sort(new ComparatorIssueByName());

        System.out.println(tmp);
        
        return true;
    }

    public boolean showIssueByAuthor(String name){

        if (name == null) return false;

        ArrayList<PeriodicalIssue> tmp = issueDao.copyArrayListIssue();
        tmp.sort(new ComparatorIssueByName());

        for (int i = 0; i < tmp.size(); i++) {
            if (name.equals(tmp.get(i).getAuthor()))
                System.out.println(tmp.get(i));
        }
        return true;
    }

    public boolean showIssueByYear(int year){

        if (year == 0) return false;

        ArrayList<PeriodicalIssue> tmp = issueDao.copyArrayListIssue();
        tmp.sort(new ComparatorIssueByName());

        for (int i = 0; i < tmp.size(); i++) {
            if (tmp.get(i).getYear() == year)
                System.out.println(tmp.get(i));
        }
        return true;
    }

    public boolean showIssueByName(String name){

        if (name == null) return false;

        ArrayList<PeriodicalIssue> tmp = issueDao.copyArrayListIssue();
        tmp.sort(new ComparatorIssueByName());

        for (int i = 0; i < tmp.size(); i++) {
            if (name.equals(tmp.get(i).getName()))
                System.out.println(tmp.get(i));
        }
        return true;
    }

}
