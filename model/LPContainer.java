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
    // instance variables
    private static LPContainer instance;
    private ArrayList<LP> lpList;
    
    /**
     * Constructor for objects of class LPContainer.
     */
    private LPContainer(){
        // initialise instance variables
        lpList = new ArrayList<LP>();
    }
    
    /**
     * Creates instance of LPContainer if it does not exist already and returns the instance.
     * 
     * @return LPContainer instance.
     */
    public static LPContainer getInstance(){
        if(instance == null){
            instance = new LPContainer(); 
        }
        return instance;
    }
    
    /**
     * Adds a new LP to the array of LPs.
     *
     * @param LP lp.
     */
    public void addLP(LP lp){
        lpList.add(lp);
    }
    
    /**
     * Searching for valid copies of an LP searched by title.
     * To return a specific copy of an LP.
     *
     * @param String title.
     * @return Copy c.
     */
    public Copy findCopyByTitle(String title){
        Copy c = null;
        Iterator it = lpList.iterator();
        boolean found = false;
        while(it.hasNext() && !found){
            LP l = (LP)it.next();
            if(title.equals(l.getTitle())){
                found = true;
                c = l.findValidCopy();
            }
        }
        return c;
    }
}
