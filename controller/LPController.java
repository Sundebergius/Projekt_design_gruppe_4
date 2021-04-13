package controller;
import java.util.ArrayList;    
import java.util.Iterator;
/**
 * Write a description of class LPController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPController
{
    // instance variables - replace the example below with your own
    private model.LPContainer LPContainer;
    ArrayList <model.Copy> copyList;

    /**
     * Constructor for objects of class LPController
     */
    public void CopyList()
    {
        // initialise instance variables
        copyList = new ArrayList<model.Copy>();
    }


    /**
     * Find the desired copy of a specific LP by searching for the title through a String. 
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
