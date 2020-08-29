package com.kira.creditcardmanagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kira.creditcardmanagement.repository.CardRepository;
import com.kiracms.creditcardmanagement.model.Card;

@Service
public class CardDataAccessService {

	@Autowired
	CardRepository cardRepository;

	public Card saveCard(Card card) {

		return cardRepository.save(card);
	}

}
