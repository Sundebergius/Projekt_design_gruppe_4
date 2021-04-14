package model;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Contains LPs and has methods for finding copy by title and adding new titles.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class LPContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<LP> lpList;
    private LP newLP;
    private LP lp;
    
    /**
     * Constructor for objects of class LPContainer
     */
    public LPContainer()
    {
        // initialise instance variables
        lpList = new ArrayList<LP>();
    }
    
    /**
     * Adds a new LP to the array of LPs.
     *
     * @param newLP
     */
    public void addLP(int barcode, String title, String artist, String publicationDate)
    {
        LP lp = new LP(barcode, title, artist, publicationDate);
        lpList.add(lp);
    }
    
    /**
     * Return copy of LP by title.
     *
     * Incomplete.
     *
     * @return copy.
     */
    public LP findCopyByTitle(String title)
    {
        LP newLp = null;
        Iterator it = lpList.iterator();
        boolean found = false;
        while(it.hasNext() && !found){
            LP l = (LP)it.next();
            if(title.equals(l.getTitle())){
                found = true;
                newLp = l;
            }
        }
        return newLp;
    }
}
