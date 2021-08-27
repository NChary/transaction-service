package com.transaction.service;

import java.util.List;

import com.transaction.model.Transaction;

public interface TransactionService {
	
	String saveTransaction(Transaction transaction);
	
	List<Transaction> fetchTransactions();
	
	String updateTransaction(Transaction transaction);
	
	String deleteTransaction(Transaction transaction);
}
