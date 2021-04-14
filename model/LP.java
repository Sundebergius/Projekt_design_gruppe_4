package model;
import java.util.ArrayList;
import java.util.Iterator;

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
    public LP(int barcode, String title, String artist, String publicationDate)
    {
        // initialise instance variables
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        copyList = new ArrayList<>();
    }

    /**
     * Return title of LP.
     *
     * @return title.
     */
    public String getTitle(){
        return title;
    }
    
    public int getBarcode(){
        return barcode;
    }
    
    public String getArtist(){
        return artist;   
    }
    
    public String getPublicationDate(){
        return publicationDate;   
    }
    
    /**
     * Add a copy to the ArrayList of this LP
     */
    public void addCopy(int serialNumber, String purchaseDate, double purchasePrice){
        Copy c = new Copy(serialNumber, purchaseDate, purchasePrice);
        copyList.add(c);
    }
    
    public void addCopy(Copy newCopy){
        copyList.add(newCopy);
    }
    /**
     * Return an Array of availabe copies of the LP
     *
     * Incomplete.
     *
     * @return copy.
     */
    public ArrayList findValidCopies()
    {
        return copyList;
    }
    
}
