package com.xworkz.chaining;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.xworkz.dao.ProductDAO;
import com.xworkz.dao.ProductDAOImpl;
import com.xworkz.dto.ProductDTO;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

	protected void doGet(javax.servlet.http.HttpServletRequest req,
			javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException ,java.io.IOException {
		
		String name=(String)req.getAttribute("prod");
		String quantity=(String)req.getAttribute("prodQuant");
		String price=(String)req.getAttribute("price");
		
		int quant=Integer.parseInt(quantity);
		double pr=Double.parseDouble(price);
		
		double totalSum=(quant*pr);
		
		ProductDTO dto= new ProductDTO();
		dto.setName(name);
		dto.setPrice(pr);
		dto.setQuantity(quant);
		dto.setSum(totalSum);
		
		ProductDAO dao= new ProductDAOImpl();
		dao.save(dto);
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("Product "+name+" Price "+totalSum);
		printWriter.close();
	};
}
