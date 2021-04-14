package controller;
import model.Loan;
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
    private Loan loan;

    /**
     * Constructor for objects of class LoanController
     */
    public LoanController()
    {
        personController = new PersonController();
        lpController = new LPController();
        loanContainer = loanContainer.getInstance();
    }
    
    public void findCopyByTitle(String title){
        lpController.findCopyByTitle(title);
    }
    
    public void findPersonByName(String name){
        person = personController.findPersonByName(name);
    }
    
    public void createLoan(){
        person = null;
        copy = null;
        
        
        
        loan = new Loan(copy, person);
        loan.getInfo();
    }
    
    public void finishLoan(){
        loanContainer.addLoan(loan);
    }
}
