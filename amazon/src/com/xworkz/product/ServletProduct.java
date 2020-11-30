package com.xworkz.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prod")
public class ServletProduct extends HttpServlet {
	
	@Override
	public void init(){
		System.out.println("init method");
	}

	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response ) throws IOException{
		String name=request.getParameter("name");
		String type=request.getParameter("type");
		String price=request.getParameter("price");
		String available=request.getParameter("available"); 
		
		
			PrintWriter printWriter=response.getWriter();
			printWriter.print("Name "+name+" " +type+"Price "+"Available "+available );
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement preparedStatement= connection.prepareStatement("insert into jdbcexamples.product_table values(?,?,?,?)");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, (type));
			preparedStatement.setInt(3,Integer. parseInt(price));
			preparedStatement.setBoolean(4, Boolean.parseBoolean(available));
			preparedStatement.execute();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
//	@Override
//	public void destroy(){
//		System.out.println("destroyed..");
//	}
//
//	@Override
//	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		String name=request.getParameter("name");
//		String type=request.getParameter("type");
//		String price=request.getParameter("price");
//		String available=request.getParameter("available"); 
//		
//		try {
//			PrintWriter printWriter=response.getWriter();
//			printWriter.print("Name "+name+" " +type+"Price "+"Available "+available );
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
//	}
}
