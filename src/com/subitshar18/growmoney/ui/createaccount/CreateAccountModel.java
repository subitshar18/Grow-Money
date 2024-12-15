package com.subitshar18.growmoney.ui.createaccount;

import java.util.Random;

import com.subitshar18.growmoney.dto.Account;
import com.subitshar18.growmoney.repository.GrowMoneyRepository;

public class CreateAccountModel {
	private CreateAccountView view;

	public CreateAccountModel(CreateAccountView createAccountView) {
		this.view = createAccountView;
	}

	public void setAccount() {
		
			String accountNumber = generateRandomAccountNumber(13);
			String ifsc = "GM010172325";
			Double balance = 0.0;
			Account account = new Account(accountNumber, ifsc, balance);
			GrowMoneyRepository.setAccount(account);

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


}
