package com.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.model.Transaction;
import com.transaction.service.TransactionService;

@RestController
@RequestMapping("/v1")
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/transaction")
	public String saveTransaction(@RequestBody Transaction transaction) {
		return transactionService.saveTransaction(transaction);
	}
	
}
