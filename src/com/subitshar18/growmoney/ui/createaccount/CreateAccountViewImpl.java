package com.subitshar18.growmoney.ui.createaccount;

import java.util.Scanner;

import com.subitshar18.growmoney.dto.Account;

public class CreateAccountViewImpl implements CreateAccountView {
	CreateAccountViewPresenter presenter;
	public CreateAccountViewImpl() {
		presenter=new CreateAccountPresenterImpl(this);
	}
	
	public void init(){
		accountConfirmation();
	}
	
	public void showAccount() {
		presenter.getAccount();
	}

	public void showAccountDetails(Account account) {
		System.out.println("Account Details....");
		System.out.println("Account number: "+account.getAccountNumber());
		System.out.println("Balance: "+account.getBalance());
		
	}
	
	public void accountConfirmation() {
		Scanner sc=new Scanner(System.in);
		String choice;
		System.out.println("Do you want to open an account type \"yes\".");
		choice=sc.nextLine();
		presenter.wantCreateAccount(choice);
	}

	@Override
	public void onSuccess() {
		System.out.println("Account Created Successfully");
		showAccount();
		
	}
	
	public Account currentAccount() {
		return presenter.gettCurrentAccount();
	}
	
	


}
