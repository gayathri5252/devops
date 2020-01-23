

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class servlet2 extends HttpServlet {
	String name;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession se=request.getSession();
		out.println(se.getAttribute("user"));
	}

}
