package tui;
import java.util.Scanner;
import controller.LoanController;
import model.Person;
import model.Copy;

/**
 * UI class for loan.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class LoanUI
{
    // instance variables
    private LoanController loanController;

    /**
     * Constructor for objects of class LoanUI.
     */
    public LoanUI(){
        loanController = new LoanController();
    }
    
    /**
     * Calling the Loan UI.
     */
    public void start(){
        loanUI();   
    }
    
    /**
     * Handling the input from the user.
     */
    private void loanUI(){
        boolean running = true;
        Copy copy = null;
        Person person = null;
        while(running){
            int choice = printMenu();
            if(choice == 1){
                person = findPersonByName();
                if(person == null){
                    System.out.println("Den indtastede person findes ikke, prøv venligst igen" + "\n");
                }
            }
            
            if(choice == 2){
                copy = findCopyByTitle();
                if(copy == null){
                    System.out.println("Den indtastede LP findes ikke, eller har ingen ledige kopier, prøv venligst igen" + "\n");
                }
            }
            
            if(choice == 3){
                
                if(copy != null && person != null){
                    createLoan(copy, person);
                    System.out.println();
                } else {
                    System.out.println("Indtast først låner og LP" + "\n");
                }
            }
            
            if(choice == 0){
                running = false;   
            }
            
            if(choice == 4){
                loanController.printLoans();   
            }
        }
    }
    
    /**
     * Creating the UI for the loan menu.
     * 
     * @return choice.
     */
    private int printMenu(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Udlånsmenu ******");
        System.out.println(" For at udlåne en LP, indtast først person (1), dernæst LP (2), og opret lån (3)");
        System.out.println(" (1) Find person");
        System.out.println(" (2) Find LP");
        System.out.println(" (3) Opret lån");
        System.out.println(" (4) Se liste over eksisterende lån");
        System.out.println(" (0) Tilbage");
        System.out.print("\n Vælg:");
        int choice = getChoice(keyboard);
        return choice;
    }
    
    /**
     * Deciding the input from the user.
     * 
     * @param Scanner keyboard.
     * @return int input.
     */
    private int getChoice(Scanner keyboard){
        while (!keyboard.hasNextInt()){
            System.out.println("Input skal være et tal");
            keyboard.nextLine();
        }
        return keyboard.nextInt();
    }
    
    /**
     * Creating the loan with the given copy and person, delivering the data to the loanController.
     * 
     * @param Copy copy, Person person.
     */
    private void createLoan(Copy copy, Person person){
        loanController.finishLoan(copy, person);
        person.getInfo();
        copy.printDetails();
        System.out.println("Lånet er blevet oprettet.");
    }
    
    /**
     * Deciding the name of the person to be searched for.
     * 
     * @return String name to be searched by the loanController.
     */
    private String inputPerson(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast navnet på personen der søges efter: ");
        String name = keyboard.nextLine();
        return name;
    }
    
    /**
     * Searching for the person to be found by the loanController.
     * 
     * @return Person person.
     */
    private Person findPersonByName(){
        Person person = null;
        String name = inputPerson();
        person = loanController.findPersonByName(name);
        return person;
    }
    
    /**
     * Searching for the copy to be found by the loanController.
     * 
     * @return Copy copy.
     */
    private Copy findCopyByTitle(){
        Copy copy = null;
        String title = inputTitle();
        copy = loanController.findCopyByTitle(title);
        return copy;
    }
    
    /**
     * Deciding the name of the LP to be searched for.
     * 
     * @return String title to be searched by the loanController.
     */
    private String inputTitle(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Indtast titlen på LP'en der søges efter: ");
        String title = keyboard.nextLine();
        return title;   
    }
}
