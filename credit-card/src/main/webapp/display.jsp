<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ page import="com.xworkz.credit_card.dto.CreditCardDTO" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="com.xworkz.credit_card.service.CreditCardService" %>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
 <%
 String name = request.getParameter("name");
	String expiryYear = request.getParameter("expiryYear");
	String color = request.getParameter("color");
	
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
	
	out.println("Thank you for entering details of"+name);
 
 %>
 <%-- <table>
		<tr>
			<th>Id</th>
			<th> Name</th>
			<th>Expiry Year</th>
			<th>Color</th>
			
		
		</tr>
		<caption style="font-size: 30px;">List Of Vaccinated details</caption>

		<c:forEach var="lDTOs" items="lDTOs">

			<tr>
				
				<td>lDTOs.getId() </td>
				<td>lDTOs.getName() </td>
				<td>lDTOs.getExpiryYear() </td>
				<td>lDTOs.getColor </td>
				
				<br>
				
			</tr>




		</c:forEach>
	</table> --%>

</body>
</html>