package com.springaop.services;

import org.springframework.stereotype.Component;

@Component("payment")
public class PaymentServiceImpl implements PaymentService {

	public void makePayment(int amount) {

		//payment code
		System.out.println(amount+" Amount debited..");
		
		//
		
		//
		System.out.println(amount+" Amount credited.");
		
	}

}
