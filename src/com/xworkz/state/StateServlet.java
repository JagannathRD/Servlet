package com.xworkz.state;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.country.dao.CountryDao;
import com.xworkz.country.dao.CountryDaoImpl;
import com.xworkz.country.dto.CountryDto;
import com.xworkz.state.dao.StateDao;
import com.xworkz.state.dao.StateDaoImpl;
import com.xworkz.state.dto.StateDto;

@WebServlet("/state")
public class StateServlet extends HttpServlet {

	public StateServlet() {
		System.out.println("Created..." +this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Init method...");
	}
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("nm");
		String language=req.getParameter("lang");
		String population=req.getParameter("pop");
		String capitalCity=req.getParameter("cap");
		String country=req.getParameter("count");
		
		StateDto dto= new StateDto();
		dto.setName(name);
		dto.setCapital(capitalCity);
		dto.setPopulation(Long.parseLong(population));
		dto.setCountry(country);
		dto.setLanguage(language);
		
		
		StateDao dao= new StateDaoImpl();
		dao.save(dto);
		
		PrintWriter writer=resp.getWriter();
		writer.print("Name "+name +" is added");
		
		
	}
}
