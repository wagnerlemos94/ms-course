package com.devsuperior.hrpayrool.services;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayrool.entites.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}