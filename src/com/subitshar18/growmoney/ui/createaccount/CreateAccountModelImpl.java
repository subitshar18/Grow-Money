package com.subitshar18.growmoney.ui.createaccount;

import java.util.Random;

import com.subitshar18.growmoney.dto.Account;
import com.subitshar18.growmoney.repository.GrowMoneyRepository;

public class CreateAccountModelImpl implements CreateAccountModel {
	private CreateAccountModelPresenter presenter;

	public CreateAccountModelImpl(CreateAccountPresenterImpl createAccountPresenterImpl) {
		this.presenter=createAccountPresenterImpl;
	}

	private void setAccount() {
			int start=1000;
			String accountNumber = "23200000"+String.valueOf(start);
			start++;
			String ifsc = "GM010172325";
			Double balance = 0.0;
			Account account = new Account(accountNumber, ifsc, balance);
			GrowMoneyRepository.setAccount(account);
			presenter.onSuccess();

	}

	private String generateRandomAccountNumber(int length) {
		Random random = new Random();
		StringBuilder accountNumber = new StringBuilder();
		accountNumber.append(random.nextInt(9) + 1);
		for (int i = 1; i < length; i++) {
			accountNumber.append(random.nextInt(10));
		}

		return accountNumber.toString();
	}
	
//	public void showAccountDetails() {
//	System.out.println("Account Details....");
//	System.out.println("Account number: "+GrowMoneyRepository.getAccount().getAccountNumber());
//	System.out.println("Balance: "+GrowMoneyRepository.getAccount().getBalance());
//	
//}
	
	public void getAccount() {
		Account account=GrowMoneyRepository.getAccount();
		checkAccount(account);
	}
	
	public Account getCurrentAccount() {
		return GrowMoneyRepository.getAccount();
	}

	private void checkAccount(Account account) {
		if(account != null) {
			presenter.showAccountDetails(account);
		}
		else {
			presenter.accountConfirmation();
		}
	
}

	@Override
	public void wantCreateAccount(String choice) {
		// TODO Auto-generated method stub
		if(choice.equalsIgnoreCase("yes")) {
			setAccount();
		}
		
	}


}
