package com.subitshar18.growmoney.dto;

public class Account {
	private String accountNumber;
	private String ifscCode;
	private Double balance;
	
	
	public Account(String accountNumber, String ifscCode, Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	

}
