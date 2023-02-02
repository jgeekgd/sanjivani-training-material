package myexample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
@SuppressWarnings("unused")
public class Bean 
{
    
    private int msgid;
	private String message;
    private Connection connection=null;
    
	private ResultSet rs = null;
    private Statement st = null;
	String connectionURL = "jdbc:mysql://localhost:3306/gd";
	
	
	    
    public Bean() 
    {
         try {
			 // Load the database driver
        	 Class.forName("com.mysql.jdbc.Driver").newInstance();
			// Get a Connection to the database
			connection = DriverManager.getConnection(connectionURL, "root", "admin"); 
			}catch(Exception e){
			System.out.println("Exception is ;"+e);
			}
        
    }  
    public void setmsgid(int msgid)
	{
		this.msgid = msgid;
	}
 
	public int getmsgid()
	{
		return (this.msgid);
	}

	public void setmessage(String message)
	{
		this.message = message;
	}
 
	public String getmessage()
	{
		return (this.message);
	}
 
    public void insert()
    {
        
       try
       {
            String sql = "insert into message(id,message) values('"+msgid+"','"+message+"')";
			Statement s = connection.createStatement();
			s.executeUpdate (sql);
			s.close ();
		}catch(Exception e){
			System.out.println("Exception is ;"+e);
		}
    }
    
}