package com.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	// Save transaction
	@PostMapping("/transaction")
	public String saveTransaction(@RequestBody Transaction transaction) {
		return transactionService.saveTransaction(transaction);
	}

	//Get list of transactions
	@GetMapping("/transaction")
	public List<Transaction> fetcTransaction() {
		return transactionService.fetchTransactions();
	}

	//Update transaction
	@PutMapping("/transaction")
	public String updateTransaction(@RequestBody Transaction transaction) {
		return transactionService.updateTransaction(transaction);
	}

	//Delete transaction
	@DeleteMapping("/transaction")
	public String deleteTransaction(@RequestBody Transaction transaction) {
		return transactionService.deleteTransaction(transaction);
	}
}
