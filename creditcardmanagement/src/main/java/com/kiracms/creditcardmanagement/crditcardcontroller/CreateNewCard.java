package com.kiracms.creditcardmanagement.crditcardcontroller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kira.creditcardmanagement.repository.CardRepository;
import com.kiracms.creditcardmanagement.model.Card;


@Controller
public class CreateNewCard {
	
	@Autowired
	CardRepository cardRepository;
	
	@PostMapping(value="/api/v1/card/create")
	public ResponseEntity<Card> createNewCard(@RequestBody Card cardNumber){
		
		
		return new ResponseEntity<Card>(cardNumber,HttpStatus.OK);
	}
	
	
	
	
}
