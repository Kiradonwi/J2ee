package com.kiracms.creditcardmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Cards")
public class Card {
	
	@Id
	private String id;
	private String name;
	private String cardNumber;
	private String expDate;
	private String cardType;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "Card id=" + id + ", name=" + name + ", cardNumber=" + cardNumber + ", expDate=" + expDate
				+ ", cardType=" + cardType + ", status=" + status ;
	}
	
	}
	
	
	

