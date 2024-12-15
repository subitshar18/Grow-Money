package com.subitshar18.growmoney.dto;

public class Bank {
	private static short bankId;

	private short id;
	private String bankName;
	private String branchName;

	public Bank(String bankName, String branchName) {
		super();
		this.id = bankId;
		this.bankName = bankName;
		this.branchName = branchName;
		bankId++;
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
