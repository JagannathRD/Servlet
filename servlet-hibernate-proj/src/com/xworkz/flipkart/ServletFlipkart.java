package com.xworkz.flipkart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.flipkart.dao.FlipkartImpl;
import com.xworkz.flipkart.dao.FlipkartInterface;
import com.xworkz.flipkart.dto.ServletFlipkartDTO;

@WebServlet("/fp")
public class ServletFlipkart extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException{
		String name= request.getParameter("name");
		String type=request.getParameter("type");
		String price=request.getParameter("price");
		
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		printWriter.print("Name "+name+"Type "+type+"Price "+price);
		
		ServletFlipkartDTO dto= new ServletFlipkartDTO();
		dto.setName(name);
		dto.setPrice(Integer.parseInt(price));
		dto.setType(type);
		
		FlipkartInterface flipkartInterface= new FlipkartImpl();
		flipkartInterface.postOrders(dto);
	}
}
