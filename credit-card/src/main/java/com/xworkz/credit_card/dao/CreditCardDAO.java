package com.xworkz.credit_card.dao;

import java.util.List;

import com.xworkz.credit_card.dto.CreditCardDTO;

public interface CreditCardDAO {

	public void save(CreditCardDTO cDTO);

	public List<CreditCardDTO> getAllDetails();

}
