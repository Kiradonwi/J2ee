package com.kira.creditcardmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kiracms.creditcardmanagement.model.Card;
@Repository
public interface CardRepository extends MongoRepository<Card, String>{
	
	Card findOneByNumber(String cardNumber); //JPA method


	void setName(String name);

	void setCardType(String name);

}
