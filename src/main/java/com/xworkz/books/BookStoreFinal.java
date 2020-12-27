package com.xworkz.books;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/bkf")
public class BookStoreFinal extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title=req.getParameter("tt");
		String author=req.getParameter("at");
		String copies=req.getParameter("noc");
		String price=req.getParameter("pr");
		
		ServletContext context= getServletContext();
		String string=context.getInitParameter("Books");
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print(string);
		printWriter.print("thank u for choosing "+title +" of author"+author);
	}
}
