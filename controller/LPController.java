package controller;
import java.util.ArrayList;    
import java.util.Iterator;

/**
 * Controls the flow of data through LP.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class LPController
{
    // instance variables
    private model.LPContainer lpContainer;
    private ArrayList <model.Copy> copyList;

    /**
     * Constructor for objects of class LPController
     */
    public LPController()
    {
        // initialise instance variables
        copyList = new ArrayList<model.Copy>();
    }

    /**
     * Find the desired copy of a specific LP by searching for the title through a String.
     * 
     * @param String title.
     * @return boolean found.
     */
    public model.Copy findCopyByTitle(String title)
    {
        model.Copy copy = null; 
        int index = 0;
        boolean found = false; 
        while(index < copyList.size() && !found)
        {
            copy = copyList.get(index);

            if(copy.equals(title))
            {
                found = true; 
            }
            else
            {
                index++;
            }
        }

        if (found)
        {
            return copyList.get(index);
        }
        else
        {
            return null;
        }
    }
}
