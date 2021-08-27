package com.transaction.service;

import java.util.List;

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

	@Override
	public List<Transaction> fetchTransactions() {
		return transactionRepository.findAll();
	}

	@Override
	public String updateTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
		return "Transaction updated succcessfully";
	}

	@Override
	public String deleteTransaction(Transaction transaction) {
		transactionRepository.delete(transaction);
		return "Transaction deleted succcessfully";
	}

}
