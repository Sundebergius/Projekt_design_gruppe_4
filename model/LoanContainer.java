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
    // instance variables
    private static LoanContainer instance;
    private ArrayList<Loan> loanList;
    private Loan newLoan;

    /**
     * Constructor for objects of class LoanContainer.
     */
    private LoanContainer(){
        // initialise instance variables
        loanList = new ArrayList<Loan>();
    }
    
    /**
     * Creates instance of LoanContainer if it does not exist already and returns the instance.
     * 
     * @return LoanContainer instance.
     */
    public static LoanContainer getInstance(){
        if(instance == null){
            instance = new LoanContainer(); 
        }
        return instance;
    }
    
    /**
     * Adds a new loan to the array of loans.
     *
     * @param Loan newLoan.
     */
    public void addLoan(Loan newLoan){
        loanList.add(newLoan);
    }
    
    public void printList(){
        
        for(Loan l : loanList){
            l.getInfo();
        }
    }
}
