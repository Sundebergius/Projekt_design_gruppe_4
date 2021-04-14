package model;

/**
 * Holds information about Person and has a method for returning name.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class Person
{
    // instance variables
    private String name;
    private String address;
    private String postalCode;
    private String city;
    private String phone;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, String address, String postalCode, String city, String phone)
    {
        // initialise instance variables
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.phone = phone;
    }

    /**
     * Return name of person
     */
    public String getName(){
        return name;   
    }
    
    /**
     * Print information about person
     *
     */
    public void getInfo()
    {
        System.out.println("Name: " + name + "\n" + "Address: " + address);
    }
}
