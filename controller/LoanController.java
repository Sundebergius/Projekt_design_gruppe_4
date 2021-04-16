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
     * Constructor for objects of class LoanController.
     */
    public LoanController(){
        personController = new PersonController();
        lpController = new LPController();
        loanContainer = loanContainer.getInstance();
    }
    
    /**
     * Finding the desired copy by title name.
     * 
     * @param String title.
     * @return Copy copy.
     */
    public Copy findCopyByTitle(String title){
        copy = lpController.findCopyByTitle(title);
        return copy;
    }
    
    /**
     * Finding the desired person by name.
     * 
     * @param String name.
     * @return Person person.
     */
    public Person findPersonByName(String name){
        person = personController.findPersonByName(name);
        return person;
    }
    
    /**
     * Finishing off the loan with the given Copy and Person & adding it to the LoanContainer.
     * 
     * @param Copy copy, Person person.
     * @return Loan loan.
     */
    public Loan finishLoan(Copy copy, Person person){
        loan = new Loan(copy, person);
        loanContainer.addLoan(loan);
        loan.getInfo();
        return loan;
    }
    
    /**
     * Printing out information about existing loans
     */
    public void printLoans(){
        loanContainer.printList();   
    }
}
