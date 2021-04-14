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
        // Copy newCopy = new Copy(1, "2011", 29.95);
        // Copy newCopy2 = new Copy(2, "2013", 29.95);
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
    
    /**
     * Return an Array of availabe copies of the LP & printing them out
     *
     * @return copyList.
     */
    public ArrayList findValidCopies()
    {
        if(copyList.size()>0){
            printInfo();
            System.out.println("Details of Copies:");
            for(Copy c : copyList){
                c.printDetails();
                System.out.println();
            }
        }
        return copyList;
    }
    
    /**
     * Printing info about the LP
     */
    public void printInfo(){
        System.out.println("Title: " + title + "\n" + "Artist: " + artist);
    }
}
