package com.subitshar18.growmoney.ui.createaccount;

import com.subitshar18.growmoney.repository.GrowMoneyRepository;

public class CreateAccountView {
	CreateAccountModel model;
	public CreateAccountView() {
		model=new CreateAccountModel(this);
	}
	
	public void init(){
		if (GrowMoneyRepository.getAccount() == null) {
		System.out.println("Your Acoount is generating please wait...");
		model.setAccount();
		System.out.println("your account created successfully");
		}
		else {
			System.out.println("You already have a Account");
			showAccountDetails();
		}
	}

	private void showAccountDetails() {
		System.out.println("Account Details....");
		System.out.println("Account number: "+GrowMoneyRepository.getAccount().getAccountNumber());
		System.out.println("Balance: "+GrowMoneyRepository.getAccount().getBalance());
		
	}

}
