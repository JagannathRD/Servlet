package com.xworkz.temple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TempleServlet extends HttpServlet{
	public TempleServlet() {
		System.out.println("calling temple...");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("Name");
		
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		printWriter.print("Name is :"+name);
	}

}
