package com.xworkz.cloths;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ckf")
public class ClothsStoreFinal extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context= getServletContext();
		String string=context.getInitParameter("Cloths");
		resp.setContentType("text/html");
		
		String type=req.getParameter("tt");
		String price=req.getParameter("pr");
		PrintWriter printWriter=resp.getWriter();
		printWriter.print(string );
		
		printWriter.print("thank u for choosing "+type +" of "+price);
	}
}
