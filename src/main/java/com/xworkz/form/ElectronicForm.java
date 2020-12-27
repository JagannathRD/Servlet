package com.xworkz.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="/select")
public class ElectronicForm extends HttpServlet{
	
	
		@Override
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
			
			ServletContext context=getServletContext();
			String string=context.getInitParameter("New");
			response.setContentType("text/html");
			
			String name=request.getParameter("nm");
			String nop=request.getParameter("nop");
			String price=request.getParameter("pr");
			
			PrintWriter writer=response.getWriter();
			writer.print(string);
			writer.print(name);
			writer.print(nop);
			writer.print(price);
		}
	
}
