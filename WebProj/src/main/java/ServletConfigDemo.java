

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletConfigDemo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
//		calling servlet config class and using getservletconfig object to get params from xml file
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("Username");
		out.println(name);
//		calling servlet context to fetch global from web-app xml 
		ServletContext cont = getServletContext();
		String gold = cont.getInitParameter("price");
		out.println(gold);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
