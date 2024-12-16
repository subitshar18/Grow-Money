package com.subitshar18.growmoney.ui.createaccount;

import com.subitshar18.growmoney.repository.GrowMoneyRepository;

public class CreateAccountViewImpl implements CreateAccountView {
	CreateAccountPresenter presenter;
	public CreateAccountViewImpl() {
		presenter=new CreateAccountPresenterImpl(this);
	}
	
	public void init(){
		if (GrowMoneyRepository.getAccount() == null) {
		System.out.println("Your Acoount is generating please wait...");
		presenter.setAccount();
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
