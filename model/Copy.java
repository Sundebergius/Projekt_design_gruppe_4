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
    private LP lp;
    private int serialNumber;
    private String purchaseDate;
    private double purchasePrice;

    /**
     * Constructor for objects of class Copy
     */
    public Copy(int serialNumber, String purchaseDate, double purchasePrice)
    {
        // initialise instance variables
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }

    /**
     * Returns title of LP.
     *
     * @return lp.getTitle()
     */
    public void getTitle()
    {
        System.out.println(lp.getTitle());
    }
}
