package controller;
import java.util.ArrayList;

/**
 * Controls the flow of data through Person.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class PersonController
{
    // instance variables
    private model.PersonContainer personContainer;
    private ArrayList<model.Person> personList;
    
    /**
     * Constructor for objects of class PersonController
     */
    public PersonController()
    {
        // initialise instance variables
        personList = new ArrayList<model.Person>();
    }
}
