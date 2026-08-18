import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		try {
			// Step 1: Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			// Step 2: Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/janfeb", "root", "7425");
			System.out.println("Connection established");
			
			// Step 3: create the medium
			Statement stmt = con.createStatement();
			System.out.println("Statement medium connected");
			
			// Step 4: Execute query
			String sql = "select * from student";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("Query executed and recieved resultset");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
