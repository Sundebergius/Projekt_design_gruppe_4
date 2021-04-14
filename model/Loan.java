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
    private static int number = 0;
    private String borrowDate;
    private String period;
    private boolean state;
    private Person person;
    private Copy copy;

    /**
     * Constructor for objects of class Person
     */
    public Loan(Copy copy, Person person){
        this.loanNumber = number + 1;
        this.borrowDate = null;
        this.period = "2 weeks";
        this.state = true;
        this.person = person;
        this.copy = copy;
    }
    
    /**
     * Creating a new loan with a copy and person
     */
    public void createLoan(Copy copy, Person person){
        Loan newLoan = new Loan(copy, person);
    }
    
    /**
     * Printing the info of the loan
     */
    public void getInfo(){
        System.out.println("loanNumber: " + loanNumber + "\n" + "Person: " + person.getName());   
    }
}
