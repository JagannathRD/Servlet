package com.xworkz.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ep")
public class ApplicationForm extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		ServletContext context=getServletContext();
		String b=context.getInitParameter("New");
		
		
		
		String name=request.getParameter("name");
		response.setContentType("text/html");
		
		PrintWriter writer=response.getWriter();
		
		writer.println("<html>"
				+"<h1>"+b+"<h1>"
				+"<form action='select' method='get'>"+
				"<body bgcolor='cyan'>"+
				"Name:<input type='text' name='nm'>"+
				"Id:<input type='text' name='id'>"
				+"No.OfProduct:<input type='text' name='nop'>"
				+"price:<input type='text' name='pr'>"
				+ "<input type='submit' value='submit'>"+"</form>"+"</body"+"</html>"
				
				);
		
		
	}
}
