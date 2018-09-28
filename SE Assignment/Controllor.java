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

    
    private Account customerList;
    private ProductList productList;

    /**
     * Constructor for objects of class Contorllor
     */
    public Controllor()
    {
        // initialise instance variables

        
        customerList=new Account();
        productList = new ProductList();

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
                        
                        customerList.addlist(tempString.trim());
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
                        createproduct(tempString);

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

    

    public boolean addCustomerList(String a)
    {
        if (customerList.containlist(a))
            return false;
        else
        {
            customerList.addlist(a);
            
            return true;
        }  
    }

    
    
    public boolean login_validation(String a)
    {

        if(customerList.ac_valid(a))        
            return true;        
        else
            return false;

    }

    public void createproduct(String a)
    {
       
        productList.addList(a);
        
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
            Date bt=sdf.parse(a); 
            Date et=sdf.parse(b); 
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

    public boolean isKG(String str) 
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

    public boolean isInteger(String str)
    {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");    
        if(pattern.matcher(str).matches())
            return true;
        else 
            return false;
    }

    public Product findExact(String a)
    {
        boolean tmpb;
        String check[];
        check = a.trim().split("/");
        if(check[5].equals("Yes"))
            tmpb = true;
        else
            tmpb = false;

        for(Product i : productList.getList())
        {
            if(i.getName().equalsIgnoreCase((check[0])) &&
            i.getQuantity().equals(check[1]) &&
            i.getPrice().equals(check[2]) &&
            i.getmkdate().equals(check[3]) &&
            i.getExprdate().equals(check[4]) &&
            i.getDon()==tmpb && 
            i.getDiscount().equals(check[6]))
                return i;
        }
        return null;
    }

    public void removeproduct(String a)
    {
        productList.remove(findExact(a));
        
    }

    public ArrayList findProduct(String a)
    {
        return productList.search(a);
    }

    public boolean containProduct(String a)
    {
        if(findExact(a)==null)
            return false;
        else
            return true;
    }

    public void EditProduct(String a, String b)
    {
        findExact(a).setQuantity(b);
    } 

    public void EditProduct(String n, String q, String p,String md,String ed,String don,String discount,String change)
    {
        boolean tmpb;
        if(don.equals("Yes"))
            tmpb=true;
        else
            tmpb=false;
        String a = n+"/"+q+"/"+p+"/"+md+"/"+ed+"/"+don+"/"+discount;

        productList.remove(findExact(a)); 
        createproduct(change);

    }
    
     public void removeAC(String a)
    {
        String[] tmp = a.split("/");
        for(Customer c : customerList.getlist())
        {
            if(tmp[0].equals(c.getID()))
            customerList.remove(c);
        }
    }
    
    public ArrayList containAccount(String a)
    {
        return customerList.search(a);
    }

    
}
