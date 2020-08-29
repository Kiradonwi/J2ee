package com.kiracms.creditcardmanagement.crditcardcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardTypeController {

	@GetMapping(value = "/api/v1/cardType")
	public ResponseEntity<List<String>> getCardType() {

		List<String> cardtype1 = new ArrayList<>();
		cardtype1.add("credit card");
		cardtype1.add("Debit card");

		return new ResponseEntity<List<String>>(cardtype1, HttpStatus.OK);
	}

}
