package com.xworkz.country;

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

@WebServlet("/country")
public class CountryServlet extends HttpServlet {

	public CountryServlet() {
		System.out.println("Created..." +this.getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Init method...");
	}
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("nm");
		String continent=req.getParameter("cont");
		String population=req.getParameter("pop");
		String area=req.getParameter("area");
		
		CountryDto dto = new CountryDto();
		dto.setName(name);
		dto.setContinent(continent);
		dto.setPopulation(Long.parseLong(population));
		dto.setArea(Long.parseLong(area));
		
		CountryDao dao= new CountryDaoImpl();
		dao.save(dto);
		
		PrintWriter writer=resp.getWriter();
		writer.print("Name "+name +" is added");
		
		
	}
}
//From X-workz ODC to Everyone:  02:44 PM
//<dependencies>
//<dependency>
//	<groupId>org.springframework</groupId>
//	<artifactId>spring-context</artifactId>
//	<version>${spring.xworkz.version}</version>
//</dependency>
//<dependency>
//	<groupId>org.springframework</groupId>
//	<artifactId>spring-webmvc</artifactId>
//	<version>${spring.xworkz.version}</version>
//</dependency>
//
//</dependencies>
//<servlet>
//<description>This is the Front Controller implementation</description>
//<servlet-name>xworkz</servlet-name>
//<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//<load-on-startup>1</load-on-startup>
//</servlet>

