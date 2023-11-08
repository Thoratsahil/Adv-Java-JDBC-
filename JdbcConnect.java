public class JdbcConnect 
{
    public static void main( String[] args )
    {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver.class");
		} catch (ClassNotFoundException e) {
			// 1st step load the driver
			e.printStackTrace();
		}
    }
}