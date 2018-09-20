import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    // instance variables - replace the example below with your own
    private ArrayList<String> arraylist;

    /**
     * Constructor for objects of class Product
     */
    public Product()
    {
        arraylist = new ArrayList<String>();

    }

    public void addlist(String a)
    {
        arraylist.add(a);
    }

}
