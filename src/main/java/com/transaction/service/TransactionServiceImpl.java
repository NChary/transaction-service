package com.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.model.Transaction;
import com.transaction.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository transactionRepository;
	
	@Override
	public String saveTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
		return "Transaction saved succcessfully";
	}

}
