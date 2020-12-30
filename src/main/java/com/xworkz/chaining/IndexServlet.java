package com.xworkz.chaining;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prod")
public class IndexServlet extends HttpServlet{
	 
	public IndexServlet() {
		System.out.println("Created..."+this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name= req.getParameter("name");
		String quantity=req.getParameter("quant");
		String price=req.getParameter("price");
		
		req.setAttribute("prod", name);
		req.setAttribute("prodQuant", quantity);
		req.setAttribute("price", price);
		RequestDispatcher dispatcher=req.getRequestDispatcher("cart");
		dispatcher.forward(req, resp);
		
	}
}
