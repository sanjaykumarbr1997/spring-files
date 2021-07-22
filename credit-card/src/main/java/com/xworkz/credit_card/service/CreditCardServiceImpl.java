package com.xworkz.credit_card.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.credit_card.dao.CreditCardDAO;
import com.xworkz.credit_card.dto.CreditCardDTO;

@Component
public class CreditCardServiceImpl implements CreditCardService {
	@Autowired
	private CreditCardDAO cDAO;

	public void validateAndSave(CreditCardDTO cDTO) {
		if(cDTO!=null) {
			cDAO.save(cDTO);
			
		}

	}

	@Override
	public List<CreditCardDTO> fetchAllDetails() {
		return cDAO.getAllDetails();
	}

}
