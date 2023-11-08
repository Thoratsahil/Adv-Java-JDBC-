import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnect 
{
    public static void main( String[] args )
    {
		Connection con=null; 
        try {

			Class.forName("com.mysql.cj.jdbc.Driver.class");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbconnectivitypractice", "root", null); //This is second step connection

			String sql="insert into student(Name,Address,contact) values(?,?,?) "; //3rd step create query


		} catch (ClassNotFoundException | SQLException e) {
			// 1st step load the driver
			e.printStackTrace();
		}
    }
}