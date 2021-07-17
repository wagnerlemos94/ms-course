package com.devsuperior.hrpayrool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayrool.entites.Payment;
import com.devsuperior.hrpayrool.entites.Worker;
import com.devsuperior.hrpayrool.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, int days) {

		
		Worker worker = workerFeignClient.findById(workerId).getBody();

		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
