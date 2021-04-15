package model;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Contains persons and has methods for both finding person by name and adding a new person.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class PersonContainer
{
    // instance variables
    private static PersonContainer instance;
    private ArrayList<Person> personList;
    private Person person;

    /**
     * Constructor for objects of class PersonContainer
     */
    private PersonContainer(){
        personList = new ArrayList<Person>();
    }
    
    /**
     * Creates instance of PersonContainer if it does not exist already and returns the instance.
     * 
     * @return PersonContainer instance.
     */
    public static PersonContainer getInstance(){
        if(instance == null)
        {
            instance = new PersonContainer();
        }
        return instance;
    }
    
    /**
     * Find person by name.
     *
     * @param String name.
     * @return Person p1.
     */
    public Person findPersonByName(String name){
        Person p1 = null;
        Iterator it = personList.iterator();
        boolean found = false;
        while(it.hasNext() && !found){
            Person p = (Person)it.next();
            if(name.equals(p.getName())){
                found = true;
                p1 = p;
                p1.getInfo();
            }
        }
        return p1;
    }
    
    /**
     * Adds a new person to the ArrayList of Person.
     * 
     * @param Person person.
     */
    public void addPerson(Person person){
        personList.add(person);
    }
    
    /**
     * Adds a person to the Arraylist of Person.
     *
     * @param Person person.
     */
    public void addLoan(Person person){
        personList.add(person);
    }
}
