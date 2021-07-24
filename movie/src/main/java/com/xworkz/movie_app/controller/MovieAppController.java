package com.xworkz.movie_app.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.movie_app.dto.MovieAppDTO;

@Component
@RequestMapping("/")
public class MovieAppController {
	
	public MovieAppController() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	@RequestMapping(value="/mvi",method=RequestMethod.POST)
	public String saveMovieDetails(@ModelAttribute MovieAppDTO mDTO) {
		System.out.println("saving movie details inside controller");
		if(!mDTO.getName().isEmpty() && mDTO.getName()!=null && mDTO.getType()!=null) {
			System.out.println("Success");
			return "/Success.jsp";	
		}
		else {
			System.out.println("failed");
			
		}
		return "/movie.jsp";
		
	}
	
	

}
