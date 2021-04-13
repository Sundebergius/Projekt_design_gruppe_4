package model;
import java.util.ArrayList;

/**
 * Contains loans and has a method for adding new loans.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class LoanContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<Loan> loanList;
    private Loan newLoan;

    /**
     * Constructor for objects of class LoanContainer
     */
    public LoanContainer()
    {
        // initialise instance variables
        loanList = new ArrayList<Loan>();
    }

    /**
     * Adds a new loan to the array of loans.
     *
     * @param newLoan
     */
    public void addLoan(Loan newLoan)
    {
        loanList.add(newLoan);
    }
}
