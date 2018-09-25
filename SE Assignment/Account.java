import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    // instance variables - replace the example below with your own
   
    private ArrayList<String> arraylist;

    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
        arraylist = new ArrayList<String>();

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void userlist(String a)
    {
        arraylist.add(a);
    }

    public void getlist(String a)
    {
        arraylist.add(a);
    }

    public boolean containlist(String a)
    {
        String[] check;
        check = a.split("/");
        boolean flag = false;
        for(String tmp : arraylist)
        {            
            String[] check1;
            check1 = tmp.split("/");
            
            if(check[0].equals(check1[0]))
            {
                flag = true;
            }
        }
                        
        if(flag == true)
        return true;
        else
        {
            //getlist(a);
        return false;
    }
    }
    
   
    public boolean ac_valid(String a)
    {
        if(arraylist.contains(a))
        return true;
        else
        return false;
    }
}
