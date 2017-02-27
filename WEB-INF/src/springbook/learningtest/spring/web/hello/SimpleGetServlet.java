package springbook.learningtest.spring.web.hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleGetServlet extends HttpServlet {
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		
		resp.getWriter().print("<HTML><BODY>");
		resp.getWriter().print("hello " + name);
		resp.getWriter().print("</HTML></BODY>");
	}
}
