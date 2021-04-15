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
    // instance variables - replace the example below with your own
    private static PersonContainer instance;
    private ArrayList<Person> personList;
    private Person person;

    /**
     * Constructor for objects of class PersonContainer
     */
    private PersonContainer()
    {
        personList = new ArrayList<Person>();
        
        // Person p1 = new Person("Erik", "Vejen 1", "9000", "Aalborg", "32233223");
        // Person p2 = new Person("Hans", "Vejen 2", "9000", "Aalborg", "43665324");
        
        // personList.add(p1);
        // personList.add(p2);
    }
    
    public void addPerson(Person person){
        personList.add(person);
    }
    
    public static PersonContainer getInstance()
    {
        if(instance == null)
        {
            instance = new PersonContainer();
        }
        return instance;
    }
    
    /**
     * Find person by name.
     *
     * Should probably be searching through the array for this?
     *
     * @param name
     * @return name
     */
    public Person findPersonByName(String name)
    {
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
     * Adds a new person to the array of persons.
     *
     * @param person
     */
    public void addLoan(Person person)
    {
        personList.add(person);
    }
}
