

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class servlet extends HttpServlet {
	String name;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		name=request.getParameter("userName");
	HttpSession session=request.getSession();
	session.setAttribute("user", name);
	out.println("<a href='servlet2'>click</a>");
	}
}
