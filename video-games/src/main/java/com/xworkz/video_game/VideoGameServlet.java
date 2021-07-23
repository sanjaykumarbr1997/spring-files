package com.xworkz.video_game;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.video_game.dto.VideoGameDTO;
import com.xworkz.video_game.service.VideoGameService;


@WebServlet("/vidg")
public class VideoGameServlet extends HttpServlet {
	
	public VideoGameServlet() {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String namee = req.getParameter("name");
		String typee = req.getParameter("type");
		String releaseYearr = req.getParameter("releaseYear");
		
		
		
		VideoGameDTO vDTO = new VideoGameDTO();
		vDTO.setName(namee);
		vDTO.setType(typee);
		vDTO.setReleaseYear(releaseYearr);
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		VideoGameService vService= applicationContext.getBean(VideoGameService.class);
		vService.validateAndSave(vDTO);
		
		PrintWriter pw= resp.getWriter();
		resp.setContentType("text/html");
		pw.println("Thank you for entering details of :"+namee);
		
		
		
		
		
	
		
		
		
		
		
	}
}
