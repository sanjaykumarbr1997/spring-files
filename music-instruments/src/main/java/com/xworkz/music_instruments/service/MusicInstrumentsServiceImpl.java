package com.xworkz.music_instruments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.music_instruments.dao.MusicInstrumentsDAO;
import com.xworkz.music_instruments.dto.MusicInstrumentsDTO;

@Component
public class MusicInstrumentsServiceImpl implements MusicInstrumentsService {
	
	@Autowired
	private MusicInstrumentsDAO mDAO;

	public void validateAndSave(MusicInstrumentsDTO mDTO) {
		if(mDTO!=null) {
			mDAO.save(mDTO);
		}
		
	}

}
