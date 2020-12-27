package com.xworkz.cloths;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cl")
public class ClothsStore extends HttpServlet {

 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletContext context =getServletContext();
	String string=context.getInitParameter("Cloths");
	
	PrintWriter printWriter=resp.getWriter();
	printWriter.print(string);
	resp.setContentType("text/html");
	printWriter.println("<html>"+"<body bgcolor='grey'>"+
			"<h1>"+string+"</h1>"+
			"<form action='ckf' method='get'>"+
			"Type:<input type='text' name='tt'>"+
			
			"NoOfPieces:<input type='text' name='nop'>"+
			"Price:<input type='text' name='pr'>"+
			"<input type='submit' value='submit'>"+
			"</form>"+"</body>"+"</html>"
					
					
					);
}
}
