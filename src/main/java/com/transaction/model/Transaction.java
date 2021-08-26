package com.transaction.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction_details")
public class Transaction {

	@Id
	@Column(name="tid")
	private int tid;
	
	@Column(name="account_no")
	private int accountNo;
	
	@Column(name="trn_type")
	private String trnType;
	
	@Column(name="actual_balance")
	private double actualBalance;
	
	@Column(name="cred_amount")
	private double credAmount;
	
	@Column(name="debt_amount")
	private double debtAmount;
	
	@Column(name="balance")
	private double balance;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getTrnType() {
		return trnType;
	}
	public void setTrnType(String trnType) {
		this.trnType = trnType;
	}
	public double getActualBalance() {
		return actualBalance;
	}
	public void setActualBalance(double actualBalance) {
		this.actualBalance = actualBalance;
	}
	public double getCredAmount() {
		return credAmount;
	}
	public void setCredAmount(double credAmount) {
		this.credAmount = credAmount;
	}
	public double getDebtAmount() {
		return debtAmount;
	}
	public void setDebtAmount(double debtAmount) {
		this.debtAmount = debtAmount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
