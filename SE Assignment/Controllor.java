import java.io.*; 
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.Format;
import java.lang.Object;
import java.util.regex.Pattern;
import java.util.Date;
import java.util.ArrayList;
/**
 * Write a description of class Contorllor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controllor
{

    private Account owner;
    private Account customer;
    private Product products;
    

    /**
     * Constructor for objects of class Contorllor
     */
    public Controllor()
    {
        // initialise instance variables
        
        owner=new Account();
        customer=new Account();
        products=new Product();

        File fileCust = new File("UserList.txt");
        try
        {
            if(fileCust.exists())
            {                 
                BufferedReader reader = null;
                try 
                {

                    reader = new BufferedReader(new FileReader(fileCust));
                    String tempString = null;
                    int line = 1;
                    while ((tempString = reader.readLine()) != null) 
                    {
                        customer.userlist(tempString.trim());
                        line++;
                    }

                    reader.close();

                } 
                catch (IOException e) 
                {
                    System.out.println("Unexpected I/O exception occurs");

                } 

            }
            else
            {
                throw new FileNotFoundException();

            }

        }
        catch(FileNotFoundException exception) 
        {                          
        } 

        File productlist = new File("ProductList.txt");
        try
        {
            if(productlist.exists())
            {                 
                BufferedReader reader = null;
                try 
                {

                    reader = new BufferedReader(new FileReader(productlist));
                    String tempString = null;
                    int line = 1;
                    while ((tempString = reader.readLine()) != null) 
                    {
                        products.addlist(tempString.trim());

                        line++;
                    }

                    reader.close();

                } 
                catch (IOException e) 
                {
                    System.out.println("Unexpected I/O exception occurs");

                } 

            }
            else
            {
                throw new FileNotFoundException();

            }

        }
        catch(FileNotFoundException exception) 
        {                          
        } 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean ownerlist(String a)
    {
        if (owner.containlist(a))
            return false;
        else
        {

            owner.userlist(a);
            try
            {

                FileWriter outputFile = new FileWriter("OwnerList.txt",true);
                outputFile.write(a+"\r\n");                      
                outputFile.close();
            }
            catch(IOException e)
            {
                System.out.println("Unexcepted IO errors");
            }
            return true;
        }
    }

    public boolean customerlist(String a)
    {
        if (customer.containlist(a))
            return false;
        else
        {
            customer.userlist(a);
            try
            {

                FileWriter outputFile = new FileWriter("UserList.txt",true);
                outputFile.write(a+"\r\n");                      
                outputFile.close();
            }
            catch(IOException e)
            {
                System.out.println("Unexcepted IO errors");
            }
            return true;
        }  
    }

    public boolean login_validation(String a)
    {

        if(customer.ac_valid(a))        
            return true;        
        else
            return false;

    }

    public void createproduct(String a)
    {
        products.addlist(a);
    }

    public boolean isValidDate(String str) {
        if(str.length()>10)
        {
            return false;
        }
        else
        {
            char ch1=str.charAt(str.length()-1);
            char ch2=str.charAt(str.length()-2);
            if(ch1<48 || ch1>57 || ch2<48|| ch2>57)
                return false;
            else
            {
                boolean convertSuccess = true;
                // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    // 设置lenient为false.
                    // 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
                    format.setLenient(false);
                    format.parse(str);
                } catch (Exception e) {
                    // e.printStackTrace();
                    // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
                    convertSuccess = false;
                }

                return convertSuccess;
            }
        }
    }

    public boolean compareDate(String a, String b)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); 
        try{
            Date bt=sdf.parse(b); 
            Date et=sdf.parse(a); 
            if (bt.before(et)||bt.equals(et))
            { 
               return true;
            }
            else
            { 
                return false;
            } 
        }
        catch(Exception e)
        {
            return false;
        }

    }
    public boolean isInteger(String str) 
    {   
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");    
        if(pattern.matcher(str).matches())
            return true;
        else if(str.charAt(str.length()-1)=='G'&& str.charAt(str.length()-2)=='K')
        {
            for (int i = str.length()-2;--i>=0;){    
                if (!Character.isDigit(str.charAt(i))){  
                    return false;  
                }  
            }
            return true;
        }
        else 
            return false;
    }

    public ArrayList findproduct(String a)
    {
        return products.search(a);
    }
    
    public boolean containproduct(String a)
    {
        if(products.contain(a))
            return true;
        else
            return false;
    }

    /*public String[] readproductlist(String a)
    {

    }*/
}
