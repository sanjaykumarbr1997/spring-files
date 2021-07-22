package com.xworkz.credit_card;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.credit_card.dto.CreditCardDTO;
import com.xworkz.credit_card.service.CreditCardService;
import com.xworkz.credit_card.service.CreditCardServiceImpl;

@WebServlet("/cred")
public class CreditCardServlet extends HttpServlet {
	
	public CreditCardServlet(){
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String expiryYear = req.getParameter("expiryYear");
		String color = req.getParameter("color");
		
		CreditCardDTO cDTO = new CreditCardDTO();
		cDTO.setName(name);
		cDTO.setExpiryYear(expiryYear);
		cDTO.setColor(color);
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		CreditCardService cService = applicationContext.getBean(CreditCardService.class);
		cService.validateAndSave(cDTO);
		
		CreditCardService cServic = applicationContext.getBean(CreditCardService.class);
		List<CreditCardDTO> lDTOs = cServic.fetchAllDetails();
		lDTOs.forEach(System.out::println);

		
		
		PrintWriter pw =resp.getWriter();
		resp.setContentType("text/html");
		pw.println("Thank you for entering details of "+name);
		
		
		
	}
	
	

}
