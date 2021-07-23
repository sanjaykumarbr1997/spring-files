<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.xworkz.video_game.dto.VideoGameDTO" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import ="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="com.xworkz.video_game.service.VideoGameService" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Video Game Details</title>
</head>
<body>
		
		<%  /*  scriplet tag*/   
		
		String namee = request.getParameter("name");
		String typee = request.getParameter("type");
		String releaseYearr = request.getParameter("releaseYear");
		
		
		
		VideoGameDTO vDTO = new VideoGameDTO();
		vDTO.setName(namee);
		vDTO.setType(typee);
		vDTO.setReleaseYear(releaseYearr);
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		VideoGameService vService= applicationContext.getBean(VideoGameService.class);
		vService.validateAndSave(vDTO);
		
		
		out.println("Thank you for entering details of :"+namee);
		out.println("ia m in jsp file");
		
		
		
		
		%>

</body>
</html>