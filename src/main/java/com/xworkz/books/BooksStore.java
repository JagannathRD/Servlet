
package com.xworkz.books;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bk")
public class BooksStore extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		String string = context.getInitParameter("Books");

		PrintWriter printWriter = resp.getWriter();
		
		
		printWriter.println("<html>"+"<body bgcolor='grey'"+
		"<h1>"+string+"</h1>"+
		"<form action='bkf' method='get'>"+
		"Title:<input type='text' name='tt'>"+
		"Author:<input type='text' name='at'>"+
		"NoOfCopies:<input type='text' name='noc'>"+
		"Price:<input type='text' name='pr'>"+
		"<input type='submit' value='submit'>"+
		"</form>"+"</body>"+"</html>"
				
				
				);
	}
}
