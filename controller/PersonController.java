package controller;
import java.util.ArrayList;
import model.PersonContainer;

/**
 * Controls the flow of data through Person.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class PersonController
{
    // instance variables
    private PersonContainer personContainer;
    private ArrayList<model.Person> personList;
    
    /**
     * Constructor for objects of class PersonController
     */
    public PersonController(){
        personContainer = personContainer.getInstance();
    }
    
    /**
     * Find person by name
     * 
     * @param String name.
     * @return Person p.
     */
    public model.Person findPersonByName(String name){
        model.Person p = null;
        p = personContainer.findPersonByName(name);
        
        return p;
    }
}
