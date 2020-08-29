package com.kiracms.creditcardmanagement.crditcardcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kira.creditcardmanagement.repository.CardRepository;
import com.kiracms.creditcardmanagement.model.Card;

@Controller
public class CardController {
	
	@Autowired
	CardRepository cardrepository;
		
	@PostMapping(value = "/api/v1/create")
	public ResponseEntity<Card> createNewCard(@RequestBody Card cardrequest) {
		System.out.println(cardrequest.toString());
		
		cardrequest.setCardNumber("2345 7894 1234 8956");
		cardrepository.save(cardrequest);

		return new ResponseEntity<Card>(cardrequest, HttpStatus.OK);
	}

}
