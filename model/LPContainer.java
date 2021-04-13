package model;
import java.util.ArrayList;

/**
 * Contains LPs and has methods for finding copy by title and adding new titles.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class LPContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<LP> LPList;
    private LP newLP;
    private LP lp;
    
    /**
     * Constructor for objects of class LPContainer
     */
    public LPContainer()
    {
        // initialise instance variables
        LPList = new ArrayList<LP>();
    }

    /**
     * Find person by name.
     *
     * Should probably be searching through the array for this?
     *
     * @param title
     * @return title
     */
    public ArrayList findCopyByTitle(String title)
    {
        return lp.findCopyByTitle(title);
    }
    
    /**
     * Adds a new LP to the array of LPs.
     *
     * @param newLP
     */
    public void addLP(LP newLP)
    {
        LPList.add(newLP);
    }
}
