package com.xworkz.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/bd")
public class ServletBiodata extends HttpServlet {

	public ServletBiodata() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init method...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("username");
		
		PrintWriter writer=resp.getWriter();
		writer.print("Hello "+name);
		resp.setContentType("text/html");
		
		HttpSession session=req.getSession();
		session.setAttribute("uname",name);
		session.setMaxInactiveInterval(200);
		
		writer.println("<html>"
				+ "<a href=servlet2> visit</a>"
				+"</html>");
	}
}
