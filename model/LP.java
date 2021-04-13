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
    public void getNumberOfCopies()
    {
        System.out.println(copyList.size());
    }
    
    /**
     * Return copy of LP by title.
     *
     * Incomplete.
     *
     * @return copy.
     */
    public ArrayList findCopyByTitle(String title)
    {
        ArrayList<Copy> totalList = new ArrayList<>();
        Iterator<Copy> co = copyList.iterator();
        boolean found = false;
        while(co.hasNext() && !found){
            Copy placeholder = (Copy)co.next();
            if(copyList.size()>0){
                totalList.add(placeholder);
            }
        }

        return totalList;
    }
    
    public void addCopy(int serialNumber, String purchaseDate, double purchasePrice){
        Copy c = new Copy(serialNumber, purchaseDate, purchasePrice);
        copyList.add(c);
    }
}
