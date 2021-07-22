package com.xworkz.credit_card.service;

import java.util.List;

import com.xworkz.credit_card.dto.CreditCardDTO;

public interface CreditCardService {

	public void validateAndSave(CreditCardDTO cDTO);

	public List<CreditCardDTO> fetchAllDetails();


}
