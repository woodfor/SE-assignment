import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
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

    public boolean contain(String a)
    {
        if(arraylist.contains(a))
            return true;
        else
            return false;
    }

    public void replace(String a,String b)
    {
        if(arraylist.contains(a))
        {
            int position=arraylist.indexOf(a);//oldId对应的index
            arraylist.set(position,b); 
        }
    } 

    public ArrayList search(String name)
    {
        ArrayList results = new ArrayList();
        Pattern pattern = Pattern.compile(name,Pattern.CASE_INSENSITIVE);
        for(int i=0; i < arraylist.size(); i++){
            String[] check;
            check = arraylist.get(i).split("/");
            Matcher matcher = pattern.matcher(check[0]);
            if(matcher.find()){
                results.add(arraylist.get(i));
            }
        }
        return results;
    }

    public void remove(String a)
    {
        arraylist.remove(a);
    }

}
