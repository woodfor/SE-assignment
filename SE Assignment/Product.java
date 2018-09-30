import java.util.UUID;

/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    // instance variables - replace the example below with your own
	private String ID;
    private String name;
    private int quantity;
    private double price;
    private String mkdate;
    private String exprdate;
    private int discount;
    private boolean donate;
    
    

    /**
     * Constructor for objects of class Product
     */
    public Product()
    {
        // initialise instance variables
        name = "";
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
        name = n;
        quantity = q;
        price = p;
        mkdate = md;
        exprdate = exp;
        donate = don;
        discount = dis;
    }
    
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
    
    public int getDiscount()
    {
        return discount;
    }
    
    public void setName(String a)
    {
        name = a;
    }
    
    public void setQuantity(String a)
    {
    	
        quantity = Integer.parseInt(a);
    }
    
    public void setQuantity(int a)
    {
    	
        quantity = a;
    }
    
    public void setPrice(double a)
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
    
    public void setDiscount(int a)
    {
        discount = a;
    }
}
