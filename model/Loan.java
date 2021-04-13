package model;

/**
 * Holds information about Loan and has a method for creating a loan.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class Loan
{
    // instance variables
    private int loanNumber;
    private String borrowDate;
    private String period;
    private boolean state;
    private Person person;
    private Copy copy;

    /**
     * Constructor for objects of class Person
     */
    public Loan(int loanNumber, String borrowDate, String period, boolean state, Person person, Copy copy)
    {
        // initialise instance variables
        loanNumber = loanNumber;
        borrowDate = borrowDate;
        period = period;
        state = state;
        person = person;
        copy = copy;
    }

    /**
     * Create a loan for person.
     * 
     * Incomplete.
     * 
     * @param Person person, Copy copy.
     */
    public void createLoan(Person person, Copy copy)
    {
        System.out.println("Placeholder");
    }
}
