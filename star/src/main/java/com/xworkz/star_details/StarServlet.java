package com.xworkz.star_details;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.star_details.dto.StarDTO;
import com.xworkz.star_details.service.StarService;

@WebServlet("/sta")
public class StarServlet extends HttpServlet {
	
	 public StarServlet() {
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		String commonName= req.getParameter("commonName");
		String scientificName = req.getParameter("scientificName");
		String distanceInLightYears = req.getParameter("distanceInLightYears");
		
		StarDTO sDTO = new StarDTO();
		sDTO.setCommonName(commonName);
		sDTO.setScientificName(scientificName);
		sDTO.setDistanceInLightYears(distanceInLightYears);
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		StarService sService = applicationContext.getBean(StarService.class);
		sService.save(sDTO);
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		pw.print("Thank you for entering details of "+ commonName);
		
	}

}
