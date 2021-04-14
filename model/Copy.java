package model;

/**
 * Holds information about copy and has a method for returning title of copy.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class Copy
{
    // instance variables - replace the example below with your own
    private int serialNumber;
    private String purchaseDate;
    private double purchasePrice;

    /**
     * Constructor for objects of class Copy
     */
    public Copy(int serialNumber, String purchaseDate, double purchasePrice){
        // initialise instance variables
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }
    
    /**
     * Method for printing out details of the copy
     */
    public void printDetails(){
        System.out.println("Serialnumber: " + serialNumber + "\n" + "Purchase date: " + purchaseDate + "\n" + "Purchase price: " + purchasePrice);
    }
}
