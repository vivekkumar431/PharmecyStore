package DB;
import java.sql.*;
public class DBConnect 
{
    public Connection con;
    public Statement stmt;
    public PreparedStatement pstmt;
    public ResultSet rst;
    public DBConnect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/pharmacy","root","root");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }     
    
}
