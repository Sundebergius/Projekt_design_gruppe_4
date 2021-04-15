package controller;
import model.LPContainer;
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
    private LPContainer lpContainer;
    private ArrayList <model.Copy> copyList;

    /**
     * Constructor for objects of class LPController.
     */
    public LPController(){
        lpContainer = lpContainer.getInstance();
    }
  
    /**
     * Find the desired copy of a specific LP by searching for the title through a String.
     * 
     * @param String title.
     * @return Copy c.
     */
    public model.Copy findCopyByTitle(String title){
        model.Copy c = null;
        c = lpContainer.findCopyByTitle(title);
        return c;
    }
}
