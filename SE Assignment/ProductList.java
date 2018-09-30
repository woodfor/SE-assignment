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
public class ProductList
{
    // instance variables - replace the example below with your own
    private ArrayList<Product> arraylist;

    /**
     * Constructor for objects of class Product
     */
    public ProductList()
    {
        arraylist = new ArrayList<Product>();

    }

<<<<<<< HEAD
    public void addList(String a)
    {
         boolean tmpb;
        String check[];
        check = a.trim().split("/");
        if(check[5].equals("Yes"))
            tmpb = true;
        else
            tmpb = false;
        
        Product tmp = new Product(check[0],Integer.parseInt(check[1]),Double.parseDouble(check[2]),check[3],check[4],tmpb,Integer.parseInt(check[6]));
        arraylist.add(tmp);
=======
    public void addList(Product a)
    {
        arraylist.add(a);
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
    }

    public ArrayList<Product> getList()
    {
        return this.arraylist;
    }

    public void remove(Product a)
    {
        if(arraylist.contains(a))
            arraylist.remove(a);
    }

    public boolean contain(Product a)
    {
        if(arraylist.contains(a))
            return true;
        else
            return false;
    }

<<<<<<< HEAD
   

    public ArrayList<Product> search(String name)
    {
        ArrayList<Product> results = new ArrayList<Product>();
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
    
    public ArrayList<Product> search()
    {
    	ArrayList<Product> results = new ArrayList<Product>();
    	for(int i=0; i < arraylist.size(); i++)
        {
        results.add(arraylist.get(i));
        }
		 
    	return results;
    }
    
    public ArrayList<Product> userSearch(String name)
    {
        ArrayList<Product> results = new ArrayList<Product>();
        try
        { Pattern pattern = Pattern.compile(name,Pattern.CASE_INSENSITIVE);
            for(int i=0; i < arraylist.size(); i++)
            {            	                 
                Matcher matcher = pattern.matcher(arraylist.get(i).getName());
                if(matcher.find())
                {                                        
                    if (arraylist.get(i).getDon()==false && !(arraylist.get(i).getQuantity()==0))
                    {
                    results.add(arraylist.get(i));
                    }
=======
    /*public void replace(Product a,Product b)
    {
    if(arraylist.contains(a))
    {
    int position=arraylist.indexOf(a);//oldId对应的index
    arraylist.set(position,b); 
    }
    } */

    public ArrayList<String> search(String name)
    {
        ArrayList<String> results = new ArrayList<String>();
        try
        { Pattern pattern = Pattern.compile(name,Pattern.CASE_INSENSITIVE);
            for(int i=0; i < arraylist.size(); i++)
            {
                String[] check;
                check = arraylist.get(i).getName().split("/");
                Matcher matcher = pattern.matcher(check[0]);
                if(matcher.find())
                {
                    String tmp;                    
                    if (arraylist.get(i).getDon()==true)
                        tmp="Yes";
                    else
                        tmp="No";

                    results.add(arraylist.get(i).getName()+"/"+
                                arraylist.get(i).getQuantity()+"/"+
                                arraylist.get(i).getPrice()+"/"+
                                arraylist.get(i).getmkdate()+"/"+
                                arraylist.get(i).getExprdate()+"/"+
                                tmp + "/" +
                                arraylist.get(i).getDiscount());
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
                }
            }
        }
        catch(Exception e)
        {
        }

        return results;
    }
<<<<<<< HEAD
    
    public ArrayList<Product> userSearch()
    {
        ArrayList<Product> results = new ArrayList<Product>();
       
            for(int i=0; i < arraylist.size(); i++)
            {
            	 
            	 if (arraylist.get(i).getDon()==false && !(arraylist.get(i).getQuantity()==0))
                 {
            		 results.add(arraylist.get(i));
            				 
							
                 }
            	 
                
               
            }
              
        return results;
    }
=======

>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f

}
