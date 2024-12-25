package com.subitshar18.growmoney.ui.moneymanagement;

import java.util.Scanner;

import com.subitshar18.growmoney.dto.Account;
import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.createaccount.CreateAccountViewImpl;

public class MoneyManagementViewImpl implements MoneyManagementView {
	MoneyManagementViewPresenter presenter;
	public MoneyManagementViewImpl() {
		presenter=new MoneyManagementPresenterImpl(this);
		}
	public void depositMoney() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the money want to deposite: ");
		Double amount=scanner.nextDouble();
		presenter.depositValidation(amount);
	}
	public void depositeUpdate() {
		System.out.println("Money Deposite into your Account Successfully");
	}

	public void withdrewMoney() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the money want to withdrew ");
		Double amount=scanner.nextDouble();
		presenter.withdrewValidation(amount);	
	}
	
	public void withdrewUpdate() {
		System.out.println("Money Withdrew from your Account Successfully");
	}
	
	public Double getBalance(Account account) {
		return presenter.accountBalance(account);
	}
	@Override
	public void balanceUpdate() {
		System.out.println("Please Open Account First");
		new CreateAccountViewImpl().accountConfirmation();
	}


}
