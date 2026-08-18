import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchRecord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/janfeb";
		String user = "root";
		String password = "7425";
		String sql = "select * from student where sid = ?";
		try {
			// Step 1: Load the driver
			Class.forName(dpath);
			// Step 2: Establish the connection
			con = DriverManager.getConnection(url,user,password);
			// Step 3: create the medium
			ps = con.prepareStatement(sql);
			
			System.out.println("Enter the id: ");
			int uid = sc.nextInt();
			
			ps.setInt(1, uid);
			// Step 4: Execute query
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));
			} else {
				System.out.println("Invalid id: " + uid);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(con != null) con.close();
				if(ps != null) ps.close();
				if(rs != null) rs.close();
				if(sc != null) sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
