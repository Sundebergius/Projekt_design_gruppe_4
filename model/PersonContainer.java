package model;
import java.util.ArrayList;

/**
 * Contains persons and has methods for both finding person by name and adding a new person.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class PersonContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<Person> personList;
    private Person person;
    // private Person newPerson; - Unsure if necessary.

    /**
     * Constructor for objects of class PersonContainer
     */
    public PersonContainer()
    {
        // initialise instance variables
        personList = new ArrayList<Person>();
    }

    /**
     * Find person by name.
     *
     * Should probably be searching through the array for this?
     *
     * @param name
     * @return name
     */
    public String findPersonByName(String name)
    {
        return person.getName();
    }
    
    /**
     * Adds a new person to the array of persons.
     *
     * @param person
     */
    public void addLoan(Person person)
    {
        personList.add(person);
    }
}
