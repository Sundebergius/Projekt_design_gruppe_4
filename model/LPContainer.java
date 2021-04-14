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
    private static LPContainer instance;
    private ArrayList<LP> lpList;
    
    /**
     * Constructor for objects of class LPContainer
     */
    private LPContainer()
    {
        // initialise instance variables
        lpList = new ArrayList<LP>();
        
        LP newLP = new LP(121212, "Back in Black", "AC/DC", "1980");
        newLP.addCopy(1, "2011", 29.95);
        newLP.addCopy(2, "2013", 30.95);
        
        LP newLP1 = new LP(144112, "The Life Of Pablo", "Kanye West", "2016");
        newLP1.addCopy(1, "2017", 25.95);
        newLP1.addCopy(2, "2018", 24.95);
        
        lpList.add(newLP);
        lpList.add(newLP1);
    }
    
    public static LPContainer getInstance(){
        if(instance == null){
            instance = new LPContainer(); 
        }
        return instance;
    }
    
    /**
     * Adds a new LP to the array of LPs.
     *
     * @param newLP
     */
    public void addLP(LP lp){
        lpList.add(lp);
    }
    
    /**
     * Searching for valid copies of an LP searched by title.
     * To return a specific copy of an LP
     *
     * @return Copy
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
