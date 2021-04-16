package tui;
import model.*;

/**
 * TryMe class for simulation.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class TryMe
{
    // instansvariables
    PersonContainer personContainer;
    LPContainer lpContainer; 

    /**
     * Constructor for objects of class TryMe.
     */
    public TryMe(){
        // initialiser instansvariable
        personContainer = PersonContainer.getInstance();
        lpContainer = LPContainer.getInstance();
    }
    
    /**
     * Generates testing data for creating a loan.
     */
    public void generateData(){
        Person person = new Person("Erik", "Vejen 1", "9000", "Aalborg", "32233223");
        Person person2 = new Person("Hans", "Vejen 2", "9000", "Aalborg", "43665324");
        personContainer.addPerson(person);
        personContainer.addPerson(person2);
        
        LP lp = new LP(144112, "The Life Of Pablo", "Kanye West", "2016");
        Copy copy = new Copy(1, "2017", 25.95);
        lp.addCopy(copy);
        lpContainer.addLP(lp);
        
        LP lp2 = new LP(121212, "Back in Black", "AC/DC", "1980");
        Copy copy2 = new Copy(1, "2011", 29.95);
        lp2.addCopy(copy2);
        lpContainer.addLP(lp2);
        
        System.out.println("Test instanser oprettet: " + "\n" + "****Personer**** " + "\n");
        person.getInfo();
        System.out.println();
        person2.getInfo();
        System.out.println("\n" + "****LP'er****" + "\n");
        lp.printInfo();
        System.out.println();
        lp2.printInfo();
        System.out.println();
    }
}
