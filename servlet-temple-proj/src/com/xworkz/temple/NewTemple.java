package com.xworkz.temple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/temp", loadOnStartup = +2, name = "Temp", 
initParams = {
		@WebInitParam(name = "Name", value = "Jaggu"), 
		@WebInitParam(name = "Age", value = "30") })

public class NewTemple extends HttpServlet {

	public NewTemple() {
		System.out.println("calling new temple.....");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("Name");

		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("Name is :" + name);
	}
}
