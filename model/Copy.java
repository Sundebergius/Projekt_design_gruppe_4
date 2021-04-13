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
    public Copy(LP lp, int serialNumber, String purchaseDate, double purchasePrice)
    {
        // initialise instance variables
        lp = lp;
        serialNumber = serialNumber;
        purchaseDate = purchaseDate;
        purchasePrice = purchasePrice;
    }

    /**
     * Returns title of LP.
     *
     * @return lp.getTitle()
     */
    public String getTitle()
    {
        return lp.getTitle();
    }
}
