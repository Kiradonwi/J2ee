package kira.com.creditcardmanagement.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kira.creditcardmanagement.dao.CardDataAccessService;
import com.kira.creditcardmanagement.repository.CardRepository;
import com.kiracms.creditcardmanagement.model.Card;

@Service
public class CardServices {

	@Autowired
	CardDataAccessService cardDao;

	public Card createCard(Card card) {

		card.setCardNumber(getRandomNumber());
		card.setStatus("Active");
		return cardDao.saveCard(card);
	}

	private String getRandomNumber() {

		Random random = new Random();
		int x = random.nextInt(10000) + 1000;

		return String.valueOf(x);
	}

}
