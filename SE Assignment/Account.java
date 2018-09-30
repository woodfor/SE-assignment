import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    // instance variables - replace the example below with your own

    private ArrayList<Customer> arraylist;

    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
        arraylist = new ArrayList<Customer>();

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addlist(String a)
    {
        String[] check;
        check = a.split("/");
        Customer tmp;
        if(check.length==5)
        tmp = new Customer(check[0],check[1],check[2],check[3],check[4]);
        else
        tmp = new Customer(check[0],check[1],check[2],check[3]);
        arraylist.add(tmp);
    }

    public ArrayList<Customer> getlist()
    {
        return arraylist;
    }
    
    public void remove(Customer a)
    {
         if(arraylist.contains(a))
            arraylist.remove(a);
    }
    
    public boolean containlist(String a)
    {
        String[] check;
        check = a.split("/");
        
        for(Customer tmp : arraylist)
        {            

            if(check[0].equals(tmp.getName()))
            {
                return true;
            }
        }

        return false;
    }

    public ArrayList<Customer> search(String name)
    {
        ArrayList<Customer> results = new ArrayList<Customer>();
        try
        { Pattern pattern = Pattern.compile(name,Pattern.CASE_INSENSITIVE);
            for(int i=0; i < arraylist.size(); i++)
            {

                Matcher matcher = pattern.matcher(arraylist.get(i).getName());
                if(matcher.find())
                {                    
                    results.add(arraylist.get(i));
                }
            }
        }
        catch(Exception e)
        {
        }

        return results;
    }

    public Customer ac_valid(String a)
    {
        String[] tmp = a.split("/");
        for(Customer c : arraylist)
        {
            if(tmp[0].equals(c.getName())&&tmp[1].equals(c.getPassword()))
            return c;
        }
        return null;
    }
    
   
}
