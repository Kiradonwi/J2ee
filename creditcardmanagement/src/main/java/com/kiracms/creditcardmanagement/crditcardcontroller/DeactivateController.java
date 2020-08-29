package com.kiracms.creditcardmanagement.crditcardcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kira.creditcardmanagement.repository.CardRepository;
import com.kiracms.creditcardmanagement.model.Card;

@Controller
public class DeactivateController {

	@Autowired
	CardRepository cardRepository;

	@PutMapping(value = "/api/v1/card/cardNumber/{deactivate}/deactivate")
	public ResponseEntity<Card> deactivate(@PathVariable("cardNumber") String cardNumber) {

		Card cardFromDb = cardRepository.findOneByNumber(cardNumber);
		cardFromDb.setStatus("Deactive");
		cardRepository.save(cardFromDb);

		return new ResponseEntity<Card>(cardFromDb, HttpStatus.OK);

	}
	
	@PutMapping(value="/api/v1/card/{cardNumber}/edit")
	public ResponseEntity<Card> editNewCard(@PathVariable("cardNumber") String cardNumber, @RequestBody Card card  ){
		
		
		Card cardFromDb = cardRepository.findOneByNumber(cardNumber);
		
		if(cardFromDb.getCardNumber()!=null) {
			
			cardRepository.setCardType(card.getName());
		}
		
		if(cardFromDb.getName()!=null) {
			
			cardRepository.setName(card.getName());
		}
		
		cardRepository.save(cardFromDb);
		
		return new ResponseEntity<Card>(card,HttpStatus.OK);
	}

}
