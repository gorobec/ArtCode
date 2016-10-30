package week2.day2.library.controller;

import week2.day2.library.comparators.AuthorPeriodicalIssueComparator;
import week2.day2.library.comparators.NamePeriodicalIssueComparator;
import week2.day2.library.comparators.NameReaderComparator;
import week2.day2.library.comparators.YearPeriodicalIssueComparator;
import week2.day2.library.config.ApplicationContext;
import week2.day2.library.dao.IssueDao;
import week2.day2.library.dao.ReaderDao;
import week2.day2.library.enums.Genre;
import week2.day2.library.exceptions.AuthorIsNullException;
import week2.day2.library.exceptions.IncorrectCriterionSortException;
import week2.day2.library.exceptions.MoreThanMaxAmountOfPeriodicalIssuesException;
import week2.day2.library.exceptions.NameIsNullException;
import week2.day2.library.model.PeriodicalIssue;
import week2.day2.library.model.Reader;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Дмитрий on 16.10.2016.
 */

// TODO Need to be done
public class Library {

    private ApplicationContext context;

    private String name;
    private ArrayList<Reader> readers;
    private ArrayList<PeriodicalIssue> issues;
    private ReaderDao readerDao;
    private IssueDao  issueDao ;


    public Library(String name) {

        context = ApplicationContext.getInstance();
        this.name = name;
        readers = new ArrayList<>();
        issues = new ArrayList<>();
        readerDao = context.getReaderDao();
        issueDao = context.getIssueDao();
    }

    public ArrayList<Reader> getReaders() {
        sortByNameReaders();
        return readers;
    }

    public ArrayList<PeriodicalIssue> getIssues(String criterionSort) throws IncorrectCriterionSortException {

        switch (criterionSort) {
            case "name":
                sort(issues, new NamePeriodicalIssueComparator());
                break;
            case "year":
                sort(issues, new YearPeriodicalIssueComparator());
                break;
            case "author":
                sort(issues, new AuthorPeriodicalIssueComparator());
                break;
            default:
                throw new IncorrectCriterionSortException();
        }

        return issues;
    }

    private void sort(ArrayList<PeriodicalIssue> issues, Comparator comparator) {
        issues.sort(comparator);
    }

    public boolean addReader(Reader reader) {
        if (reader == null || readers.contains(reader) || reader.isBlackList()) return false;

        return readers.add(reader);
    }

    public boolean addPeriodicalIssue(PeriodicalIssue issue) {
        if (issue == null) return false;

        return issues.add(issue);

        }

    private void sortByNameReaders() {
        readers.sort(new NameReaderComparator());
    }

    public ArrayList<PeriodicalIssue> getAllIssuesThatHaveReaders() {

        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (int i = 0; i < readers.size(); i++) {
            res.addAll(readers.get(i).getIssues());
        }

        sort(res, new NamePeriodicalIssueComparator());

        return res;
    }

    public boolean setBlackList(Reader reader) {

        if(reader == null) return false;

        reader.setBlackList(true);
        return true;
    }


    public ArrayList<PeriodicalIssue> getPeriodicalIssuesByAuthor(String authorName) throws AuthorIsNullException {

        if (authorName == null) throw new AuthorIsNullException();

        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (PeriodicalIssue issue : issues)
            if (issue.getAuthorName().equals(authorName)) {
                res.add(issue);
            }

        sort(res, new NamePeriodicalIssueComparator());

        return res;
    }

    public ArrayList<PeriodicalIssue> getPeriodicalIssuesByName(String name) throws NameIsNullException {

        if (name == null) throw new NameIsNullException();
        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (PeriodicalIssue issue : issues)
            if (issue.getName().equals(name)) {
                res.add(issue);
            }

        sort(res, new AuthorPeriodicalIssueComparator());

        return res;
    }

    public ArrayList<PeriodicalIssue> getPeriodicalIssuesByYear(int year) {

        ArrayList<PeriodicalIssue> res = new ArrayList<>();

        for (PeriodicalIssue issue : issues)
            if (issue.getYear() == year) {
                res.add(issue);
            }

        sort(res, new NamePeriodicalIssueComparator());

        return res;

    }

    public int amountOfReaders() {
        return readers.size();
    }

    public int amountOfPeriodicalIssues() {
        return issues.size();
    }

    public boolean giveIssueToReader(String readerName, String issueName, String author, int year, Genre genre) throws MoreThanMaxAmountOfPeriodicalIssuesException {

        if(!readerDao.findReader(readerName)) return false;
        if(!issueDao.findIssue(issueName, author, year, genre)) return false;

        Reader reader = readerDao.getReader(readerName);

       return reader.addPeriodicalIssue(issueDao.getIssue(issueName, author, year, genre));

    }

    public void setReaderDao(ReaderDao readerDao) {
        this.readerDao = readerDao;
    }

    public void setIssueDao(IssueDao issueDao) {
        this.issueDao = issueDao;
    }
}
