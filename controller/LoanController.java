package controller;
import model.Person;
import model.Copy;

/**
 * Controls the flow of data through Loan.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class LoanController
{
    // instance variables
    private PersonController personController;
    private LPController lpController; 
    private model.LoanContainer loanContainer;
    private Person person;
    private Copy copy;

    /**
     * Constructor for objects of class LoanController
     */
    public LoanController()
    {
        // initialise instance variables
        
    }
    
    public Copy findCopyByTitle(String title){
        
        
        return copy;
    }
}
