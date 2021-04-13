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
        name = name;
        address = address;
        postalCode = postalCode;
        city = city;
        phone = phone;
    }

    /**
     * Get method for person's name.
     *
     * @return name.
     */
    public String getName()
    {
        return name;
    }
}
