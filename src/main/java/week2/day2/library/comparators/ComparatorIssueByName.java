package week2.day2.library.comparators;

import week2.day2.library.model.PeriodicalIssue;

import java.util.Comparator;

/**
 * Created by Alexander on 02.11.2016.
 */
public class ComparatorIssueByName implements Comparator<PeriodicalIssue>{

    @Override
    public int compare(PeriodicalIssue issue1, PeriodicalIssue issue2) {
        return issue1.getName().compareTo(issue2.getName());
    }
}
