package com.subitshar18.growmoney.ui.moneymanagement;

import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.home.HomeViewImpl;

public class MoneyManagementModelImpl implements MoneyManagementModel {
	MoneyManagementPresenter presenter;
	
	public MoneyManagementModelImpl(MoneyManagementPresenterImpl moneyManagementPresenterImpl) {
		presenter=moneyManagementPresenterImpl;
	}
	
	private void depositMoney(Double amount) {
		Double balance=GrowMoneyRepository.getAccount().getBalance();
		GrowMoneyRepository.getAccount().setBalance(balance+amount);
	}

	public void withdrewValidation(Double amount) {
		double balance = GrowMoneyRepository.getAccount().getBalance();
		if (amount <= 0) {
			System.out.println("Amount must not in Negetive.");
			presenter.withdrewMoney();
			return;
		}
		else if (amount <= balance) {
			withdrewMoney(amount);
			presenter.withdrewUpdate();
		}
		else {
			System.out.println("Insuffient Balance...");
//			presenter.withdrewMoney();
			new HomeViewImpl().init();
			return;
		}

	}
	private void withdrewMoney(Double amount) {
		Double balance=GrowMoneyRepository.getAccount().getBalance();
		GrowMoneyRepository.getAccount().setBalance(balance-amount);
		
	}

	@Override
	public void depositValidation(Double amount) {
			if(amount<=0) {
				System.out.println("Enter the valid input");
				presenter.depositMoney();
			}
			else {
				depositMoney(amount);
				presenter.depositeUpdate();
			}
			
		}
		
	}
	
	
	


