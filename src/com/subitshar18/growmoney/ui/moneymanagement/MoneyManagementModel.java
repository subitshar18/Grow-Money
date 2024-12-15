package com.subitshar18.growmoney.ui.moneymanagement;

import com.subitshar18.growmoney.repository.GrowMoneyRepository;

public class MoneyManagementModel {
	MoneyManagementView view;
	public MoneyManagementModel(MoneyManagementView moneyManagementView) {
		this.view=moneyManagementView;
	}
	public void depositeValidation(Double amount) {
		if(amount<=0) {
			System.out.println("Enter the valid input");
			view.depositeMoney();
		}
		else {
			depositeMoney(amount);
		}
	}
	//depositeMoney
	private void depositeMoney(Double amount) {
		GrowMoneyRepository.getAccount().setBalance(
				GrowMoneyRepository.getAccount().getBalance()+amount);
	}

	public void withdrewValidation(Double amount) {
		double balance = GrowMoneyRepository.getAccount().getBalance();
		if (amount <= 0) {
			System.out.println("Amount must not in Negetive.");
		}
		if (amount <= balance) {
			withdrewMoney(amount);
		}

	}
	private void withdrewMoney(Double amount) {
		GrowMoneyRepository.getAccount().setBalance(
				(GrowMoneyRepository.getAccount().getBalance()-amount));
		
	}
	
	
	

}
