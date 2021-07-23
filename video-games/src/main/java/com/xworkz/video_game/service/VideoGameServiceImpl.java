package com.xworkz.video_game.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.video_game.dao.VideoGameDAO;
import com.xworkz.video_game.dto.VideoGameDTO;

@Component
public class VideoGameServiceImpl implements VideoGameService {
	
	@Autowired
	private VideoGameDAO vDAO;
	
	
	public void validateAndSave(VideoGameDTO vDTO) {
		
		vDAO.save(vDTO);
		
	}

}
