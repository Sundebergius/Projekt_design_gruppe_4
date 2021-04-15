package tui;
import model.*;

/**
 * Lav en beskrivelse af klassen TryMe her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class TryMe
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    PersonContainer personContainer;
    LPContainer lpContainer; 

    /**
     * Konstruktør for objekter af klassen TryMe
     */
    public TryMe()
    {
        // initialiser instansvariable
        personContainer = PersonContainer.getInstance();
        lpContainer = LPContainer.getInstance();
    }

    // /**
     // generate the data of the TryMe class. 
     // */
    // public void generateData()
    // {
        // // indsæt din egen kode her
        // Person tester = new Person("Mads Mikkelsen", "Sofiendalsvej 60", "9200", "Aalborg SV", "12345678");
        // personContainer.addPerson(tester); 
        // LP record = new LP();
        // Copy copy = new Copy(); 
        
    // }
}
