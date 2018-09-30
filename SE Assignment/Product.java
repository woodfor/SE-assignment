<<<<<<< HEAD
import java.util.UUID;
=======
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f

/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    // instance variables - replace the example below with your own
<<<<<<< HEAD
	private String ID;
    private String name;
    private int quantity;
    private double price;
    private String mkdate;
    private String exprdate;
    private int discount;
=======
    private String name;
    private String quantity;
    private String price;
    private String mkdate;
    private String exprdate;
    private String discount;
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
    private boolean donate;
    
    

    /**
     * Constructor for objects of class Product
     */
    public Product()
    {
        // initialise instance variables
        name = "";
<<<<<<< HEAD
        quantity = 0;
        price = 0;
        mkdate = "";
        exprdate = "";
        discount = 0;
        donate = false;
    }
    
    public Product(String n, int q, double p, String md, String exp, boolean don, int dis)
    {
    	ID=UUID.randomUUID().toString().replace("-", "");
=======
        quantity = "";
        price = "";
        mkdate = "";
        exprdate = "";
        discount = "100";
        donate = false;
    }
    
    public Product(String n, String q, String p, String md, String exp, boolean don, String dis)
    {
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
        name = n;
        quantity = q;
        price = p;
        mkdate = md;
        exprdate = exp;
        donate = don;
        discount = dis;
    }
    
<<<<<<< HEAD
    public Product(String ID, String n, int q, double p, String md, String exp, boolean don, int dis)
    {    	
    	this.ID = ID;
        name = n;
        quantity = q;
        price = p;
        mkdate = md;
        exprdate = exp;
        donate = don;
        discount = dis;
    }
    
    public String getID()
    {
    	return ID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public double getPrice()
=======
    public String getName()
    {
        return name;
    }
    
    public String getQuantity()
    {
        return quantity;
    }
    
    public String getPrice()
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
    {
        return price;
    }
    
    public String getmkdate()
    {
        return mkdate;
    }
    
    public String getExprdate()
    {
        return exprdate;
    }
    
    public boolean getDon()
    {
        return donate;
    }
    
<<<<<<< HEAD
    public int getDiscount()
=======
    public String getDiscount()
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
    {
        return discount;
    }
    
    public void setName(String a)
    {
        name = a;
    }
    
    public void setQuantity(String a)
    {
<<<<<<< HEAD
    	
        quantity = Integer.parseInt(a);
    }
    
    public void setQuantity(int a)
    {
    	
        quantity = a;
    }
    
    public void setPrice(double a)
=======
        quantity = a;
    }
    
    public void setPrice(String a)
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
    {
        price = a;
    }
    
    public void setmkdate(String a)
    {
        mkdate = a;
    }
    
    public void setExprdate(String a)
    {
        exprdate = a;
    }
    
    public void setDon(boolean a)
    {
        donate = a;
    }
    
<<<<<<< HEAD
    public void setDiscount(int a)
=======
    public void setDiscount(String a)
>>>>>>> 520ba2697044072a9ce2b44688fcdfc95c67d63f
    {
        discount = a;
    }
}
