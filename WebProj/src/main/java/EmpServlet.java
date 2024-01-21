
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EmpServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String eno = request.getParameter("eName");
		String dept = request.getParameter("dept");
		String salary = request.getParameter("salary");
		out.println(eno);
		out.println(dept);
		out.println(salary);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
