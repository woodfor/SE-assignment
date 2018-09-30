import java.io.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.Format;
import java.lang.Object;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Contorllor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Controllor
{

<<<<<<< HEAD
	ArrayList<Product> tmplist;
    private Account customerList;
    private ProductList productList;
    private Customer customer;
=======
    private Account owner;
    private Account customer;
    private ProductList productList;
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f

    /**
     * Constructor for objects of class Contorllor
     */
    public Controllor()
    {
        // initialise instance variables

<<<<<<< HEAD
    	tmplist = new ArrayList<Product>();
        customerList=new Account();
=======
        owner=new Account();
        customer=new Account();
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
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
    	customer = customerList.ac_valid(a);
    

        if( customer == null)                    
        	return false;        	       	        	      
        else
        {
        	
        	return true;
        }
        	
    }

    public void createproduct(String a)
    {
<<<<<<< HEAD
       
        productList.addList(a);
        
=======
        boolean tmpb;
        String check[];
        check = a.trim().split("/");
        if(check[5].equals("Yes"))
            tmpb = true;
        else
            tmpb = false;
        Product tmp = new Product(check[0],check[1],check[2],check[3],check[4],tmpb,check[6]);
        productList.addList(tmp);

>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
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
               
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    
                    format.setLenient(false);
                    format.parse(str);
                } catch (Exception e) {
                    // e.printStackTrace();
                    
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
<<<<<<< HEAD
    
    public boolean isDouble(String str) 
    {
    	if (null == str || "".equals(str)) 
    	{	
    		return false;	
    		}	
    	Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");	
    	return pattern.matcher(str).matches();
    }

   

    public Product findExact(String a)
    {
        
        for(Product i : productList.getList())
        {
            if(i.getID().equals(a)) 
                return i;
        }
        return null;
    }
    
    public Product findExactTemp(String a)
    {
    	for(Product i : tmplist)
        {
            if(i.getID().equals(a)) 
=======

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
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
                return i;
        }
        return null;
    }
<<<<<<< HEAD
    
    public Order findExactOrder(String a)
    {
    	for(Order i: customer.getOrderList(""))
    	{
    		if(i.getCreateTime().equals(a))
    			return i;
    	}
    	return null;
    }

    public void removeproduct(String a)
    {
    	String[] check = a.split("/");
        productList.remove(findExact(check[7]));
        
    }
    public void removeTmpproduct(String a)
    {
    	tmplist.remove(findExactTemp(a));
    }

    public ArrayList<String> findProduct(String a)
    {
    	ArrayList<String> results = new ArrayList<String>();
    	String tmp;
    	    	 
    	 for(Product item : productList.search(a))
         {
    		 if (item.getDon()==true)
                 tmp="Yes";
             else
                 tmp="No";
         	results.add( item.getName()+"/"+
                                 item.getQuantity()+"/"+
                                 item.getPrice()+"/"+
                                 item.getmkdate()+"/"+
                                 item.getExprdate()+"/"+    
                                 tmp + "/" +
                                 item.getDiscount()+"/"+item.getID());
         }
    	 
         return results;
    }
    public ArrayList<String> findProduct()
    {
    	ArrayList<String> results = new ArrayList<String>();
    	String tmp;
    	    	 
    	 for(Product item : productList.search())
         {
    		 if (item.getDon()==true)
                 tmp="Yes";
             else
                 tmp="No";
         	results.add(item.getName()+"/"+
                                 item.getQuantity()+"/"+
                                 item.getPrice()+"/"+
                                 item.getmkdate()+"/"+
                                 item.getExprdate()+"/"+    
                                 tmp + "/" +
                                 item.getDiscount()+"/"+item.getID());
         }
    	 
         return results;
               	 
    }

    public ArrayList<String> userFindProduct(String a)
    {
    	ArrayList<String> results = new ArrayList<String>();
        for(Product item : productList.userSearch(a))
        {
        	results.add(item.getName()+"/"+
                                item.getQuantity()+"/"+
                                item.getPrice()+"/"+
                                item.getmkdate()+"/"+
                                item.getExprdate()+"/"+                                
                                item.getDiscount()+"/"+item.getID());
        }
        return results;
    }
    public ArrayList<String> userFindProduct()
    {
    	ArrayList<String> results = new ArrayList<String>();
        for(Product item : productList.userSearch())
        {
        	results.add(item.getName()+"/"+
                                item.getQuantity()+"/"+
                                item.getPrice()+"/"+
                                item.getmkdate()+"/"+
                                item.getExprdate()+"/"+                                
                                item.getDiscount()+"/"+item.getID());
        }
        return results;
    }

    public String containProduct(String a)
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
             i.getPrice()==(Double.parseDouble(check[2])) &&
             i.getmkdate().equals(check[3]) &&
             i.getExprdate().equals(check[4]) &&
             i.getDon()==tmpb && 
             i.getDiscount()==Integer.parseInt(check[6]))
             return i.getID();
         }
         return null;
    }

    public void EditProduct(String a, String b)
    {
        findExact(a).setQuantity(b);
    }
    public void editTmpProduct(String a, String b)
    {
        findExactTemp(a).setQuantity(b);
    }
    public String getQuantity(String a)
    {
    	return Integer.toString(findExact(a).getQuantity());
    }

    public void EditProduct(String ID,String n, String q, String p,String md,String ed,String don,String discount,String change)
    {
    	String[] check = change.split("/");
        boolean tmpb;
        if(check[5].equals("Yes"))
            tmpb=true;
        else
            tmpb=false;
        String a = n+"/"+q+"/"+p+"/"+md+"/"+ed+"/"+don+"/"+discount;
        Product tmp = findExact(ID);
        tmp.setName(check[0]);
        tmp.setQuantity(check[1]);
        tmp.setmkdate(check[3]);
        tmp.setExprdate(check[4]);
        tmp.setPrice(Double.parseDouble(check[2]));
        tmp.setDon(tmpb);
        tmp.setDiscount(Integer.parseInt(check[6]));
       

    }
    
     public void removeAC(String a)
    {
        String[] tmp = a.split("/");
        
        for (Iterator<Customer> iterator = customerList.getlist().iterator(); iterator.hasNext(); ) {
            
        	 if(tmp[0].equals(iterator.next().getID())) 
        	 {
                iterator.remove();
            }      
    }
    }
    
    public ArrayList<String> containAccount(String a)
    {
    	ArrayList<String> results = new ArrayList<String>();
        for(Customer item : customerList.search(a))
        {
        	results.add(item.getID()+"/"+
                                item.getName()
                               );
        }
        return results;
    	
    }
    
    public void addProductToOrder(String a,String qs)//merge
    {
    	
   	 boolean tmpb;
        String check[];
        check = a.trim().split("/");
        if(check[5].equals("Yes"))
            tmpb = true;
        else
            tmpb = false;
         
        if(tmplist.isEmpty())
        	tmplist.add(new Product(check[7],check[0],Integer.parseInt(qs),Double.parseDouble(check[2]),check[3],check[4],tmpb,Integer.parseInt(check[6])));
        else
        {
        	Product tmp = findExactTemp(check[7]);
        
        if(tmp ==null)
        {
        	 tmplist.add(new Product(check[7],check[0],Integer.parseInt(qs),Double.parseDouble(check[2]),check[3],check[4],tmpb,Integer.parseInt(check[6])));
        }                   		
        else
    	{
    		 
           tmp.setQuantity(tmp.getQuantity()+Integer.parseInt(qs));
            
    	}		
    }
        
                            
    }
    
    public ArrayList<String> shopChart(String a)
    {
    	ArrayList<String> results = new ArrayList<String>();
    	if(a.trim().isEmpty())
    	{
    	for(Product item: tmplist)
    	{
    		
    	results.add(item.getName()+"/"+
                item.getQuantity()+"/"+                
                item.getmkdate()+"/"+
                item.getExprdate()+"/"+ "total: " + (item.getQuantity()
            	*0.01
            	*item.getPrice() * item.getDiscount())
            	+ " AUD"+ "/"+ item.getID());
    	}
    	}
    	else
    	{
    		 try
    	        { Pattern pattern = Pattern.compile(a,Pattern.CASE_INSENSITIVE);
    	            for(Product item: tmplist)
    	            {
    	            	 
    	                
    	                Matcher matcher = pattern.matcher(item.getName());
    	                if(matcher.find())
    	                {          results.add(item.getName()+"/"+
    	                        item.getQuantity()+"/"+                
    	                        item.getmkdate()+"/"+
    	                        item.getExprdate()+"/"+ "total: " + (item.getQuantity()
    	                    	*0.01
    	                    	*item.getPrice() * item.getDiscount())
    	                    	+ " AUD"+"/"+ item.getID());
    	                               
    	                }
    	            }
    	        }
    	        catch(Exception e)
    	        {
    	        }
    	}
    	return results;
=======

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

>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
    }
    
    public void addPListToOrder()
    {
    	customer.addProduct(tmplist);
    	tmplist = new ArrayList<Product>();
    }
    
    

 public ArrayList<String> orderList(String name)//contain null
    {
    	  ArrayList<String> results = new ArrayList<String>();
    	  String tmp="";

    		for(Order item : customer.getOrderList(name))
            {
    			tmp = "";
               for(Product p : item.getProductList())
               {
            	   tmp += p.getName()+",";
               }
              tmp += "/" +item.getTotal() +" AUD"+"/"+"Paid: "+item.getPaid()+"/"+item.getCreateTime() ;
              results.add(tmp);
               	
            }
    		    	                                              
    	return results;
    }
 
 public void purchase(String a)
 {
	 String[] tmp = a.split("/");
	 findExactOrder(tmp[tmp.length-1]).setPaid(true);
 }
    
}
