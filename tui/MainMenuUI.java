package tui;
import java.util.Scanner;

/**
 * Main menu UI for all UI's.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class MainMenuUI
{
    private LoanUI loanUI;
    private TryMe testData;
    
    /**
     * Konstruktør for objekter af klassen MainMenuUI
     */
    public MainMenuUI(){
        loanUI = new LoanUI();
        testData = new TryMe();
    }

    /**
     * Calling the mainMenu
     */
    public void start(){
        mainMenu();
    }
    
    /**
     * Creating the mainMenu UI.
     */
    private void mainMenu(){
        boolean running = true;
        while(running){
            int choice = printOptions();
            switch (choice){
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
                  testData.generateData();
                  break;
                case 0:
                  System.out.println("Tak for denne gang.");
                  running = false;
                  break;
            }
        }
    }
    
    /**
     * List of UI options.
     * 
     * @return choice.
     */
    private int printOptions(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Hovedmenu ******");
        System.out.println(" (1) Lånermenu");
        System.out.println(" (2) LP menu");
        System.out.println(" (3) Udlånsmenu");
        System.out.println(" (9) Generer testdata");
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

