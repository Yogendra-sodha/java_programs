import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class RegisterServlet extends HttpServlet {
	Connection conn;
	
	public void init(ServletConfig config) {
//		establish connection in init method
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_login","","");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String u_name = request.getParameter("userName");
		String password = request.getParameter("password");
		
		try {
			PreparedStatement p1 = conn.prepareStatement("INSERT INTO users (name, u_name, password) VALUES (?, ?, ?)");
			 p1.setString(1, name);       // Set the value for the first parameter (name)
			 p1.setString(2, u_name);   // Set the value for the second parameter (userName)
			 p1.setString(3, password);   // Set the value for the third parameter (password)
			    
			p1.executeUpdate();
			out.println("Registered Succesfully");
			out.println("click <a href=\"/LoginApp/login.jsp\">here </a> to login");
		
		} catch (SQLException e) {
			out.println(e);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	public void destroy() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}