import java.io.*; 
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

    /**
     * Constructor for objects of class Contorllor
     */
    public Controllor()
    {
        // initialise instance variables
        owner=new Account();
        customer=new Account();
       
             
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
                        customer.userlist(tempString);
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
}
