import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcConnect 
{
    public static void main( String[] args )
    {
		Connection con=null; 
		PreparedStatement pst=null;
        try {

			Class.forName("com.mysql.cj.jdbc.Driver.class");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbconnectivitypractice", "root", null); //This is second step connection

			String sql="insert into student(Name,Address,contact) values(?,?,?) "; //3rd step create query

			pst=con.prepareStatement(sql);
			pst.setString(1, "Sayluu");
			pst.setString(2, "Sangli");
			pst.setString(3, "9139223344"); //this is 4th step create connection


		} catch (ClassNotFoundException | SQLException e) {
			// 1st step load the driver
			e.printStackTrace();
		}
    }
}