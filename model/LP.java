package model;
import java.util.ArrayList;

/**
 * Holds information about LP and has methods for:
 * Returning title.
 * Returning number of copies
 * Finding copy by title.
 *
 * @ Mathias, Oliver & Rasmus.
 * @ Version 1
 */
public class LP
{
    // instance variables
    private int barcode;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<Copy> copyList;

    /**
     * Constructor for objects of class Person
     */
    public LP(int barcode, String title, String artist, String publicationDate, ArrayList<Copy> copyList)
    {
        // initialise instance variables
        barcode = barcode;
        title = title;
        artist = artist;
        publicationDate = publicationDate;
        copyList = copyList;
    }

    /**
     * Return title of LP.
     *
     * @return title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return title of LP.
     *
     * Incomplete.
     *
     * @return title.
     */
    public ArrayList<Copy> getNumberOfCopies()
    {
        return null;
    }
    
    /**
     * Return copy of LP by title.
     *
     * Incomplete.
     *
     * @return copy.
     */
    public ArrayList<Copy> findCopyByTitle(String title)
    {
        return null;
    }
}
