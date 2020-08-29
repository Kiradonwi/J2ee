package com.kiracms.creditcardmanagement.crditcardcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kiracms.creditcardmanagement.model.LoginRequest;
import com.kiracms.creditcardmanagement.model.LoginResponse;

@Controller
public class LoginController {

	@PostMapping(value="/api/v1/login")
	public ResponseEntity<LoginResponse> createLogin(@RequestBody LoginRequest loginrequest) {

		LoginResponse loginresponse = new LoginResponse();
		loginresponse.setAccessToken("SLRC1245SLBc");

		return new ResponseEntity<LoginResponse>(loginresponse, HttpStatus.OK);
	}

}
