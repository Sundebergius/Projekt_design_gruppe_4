package tui;
import java.util.Scanner;

/**
 * Lav en beskrivelse af klassen MainMenuUI her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class MainMenuUI
{
    private LoanUI loanUI;
    
    /**
     * Konstruktør for objekter af klassen MainMenuUI
     */
    public MainMenuUI()
    {
        loanUI = new LoanUI();
    }

    /**
     * Et eksempel på en metode - erstat denne kommentar med din egen
     * 
     * @param  y  eksempel på en parameter til en metode
     * @return    summen af x og y 
     */
    public void start(){
        mainMenu();
    }
    
    private void mainMenu(){
        boolean running = true;
        while(running){
            int choice = printOptions();
            switch (choice) {
                case 1:
                  System.out.println("Denne er ikke implementeret endnu");
                  break;
                case 2:
                  System.out.println("Denne er ikke implementeret endnu");
                  break;
                case 3:
                  loanUI.start();
                  break;
                case 9:
                  System.out.println("Denne er ikke implementeret endnu");
                  break;
                case 0:
                  System.out.println("Tak for denne gang.");
                  running = false;
                  break;
                default:
                  System.out.println("Der er sket en uforklarlig fejl, choice = "+choice);
                  break;
            }
        }
    }
    
    private int printOptions(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Hovedmenu ******");
        System.out.println(" (1) Lånermenu");
        System.out.println(" (2) LP menu");
        System.out.println(" (3) Udlånsmenu");
        System.out.println(" (9) Generer testdata");// will generate testdata, delete in final version
        System.out.println(" (0) Afslut programmet");
        System.out.print("\n Vælg:");
        
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }
}

