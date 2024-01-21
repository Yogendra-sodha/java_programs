package jdbc;
import java.sql.*;


public class PostgresDemo {
	public static void main(String [] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String name = "";
			String password = "";
			Connection conn  = DriverManager.getConnection(url, name, password);
			Statement st = conn.createStatement();
			ResultSet rs =  st.executeQuery("Select * from status");
			while (rs.next()) {
				System.out.println(rs.getInt("status_id"));
			}
			System.out.println("Done");
			st.close();
			conn.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
//		finally {
////			conn.close();
//		}
	}

}
