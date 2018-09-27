
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    // instance variables - replace the example below with your own
    private String name;
    private String quantity;
    private String price;
    private String mkdate;
    private String exprdate;
    private String discount;
    private boolean donate;
    
    

    /**
     * Constructor for objects of class Product
     */
    public Product()
    {
        // initialise instance variables
        name = "";
        quantity = "";
        price = "";
        mkdate = "";
        exprdate = "";
        discount = "100";
        donate = false;
    }
    
    public Product(String n, String q, String p, String md, String exp, boolean don, String dis)
    {
        name = n;
        quantity = q;
        price = p;
        mkdate = md;
        exprdate = exp;
        donate = don;
        discount = dis;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getQuantity()
    {
        return quantity;
    }
    
    public String getPrice()
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
    
    public String getDiscount()
    {
        return discount;
    }
    
    public void setName(String a)
    {
        name = a;
    }
    
    public void setQuantity(String a)
    {
        quantity = a;
    }
    
    public void setPrice(String a)
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
    
    public void setDiscount(String a)
    {
        discount = a;
    }
}
