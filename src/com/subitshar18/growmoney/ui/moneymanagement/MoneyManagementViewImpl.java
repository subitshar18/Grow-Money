package com.subitshar18.growmoney.ui.moneymanagement;

import java.util.Scanner;

import com.subitshar18.growmoney.repository.GrowMoneyRepository;

public class MoneyManagementViewImpl implements MoneyManagementView {
	MoneyManagementPresenter presenter;
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
		System.out.println("Current Balance:"+presenter.getBalance());
	}

	public void withdrewMoney() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the money want to withdrew ");
		Double amount=scanner.nextDouble();
		presenter.withdrewValidation(amount);	
	}
	
	public void withdrewUpdate() {
		System.out.println("Money Withdrew from your Account Successfully");
		System.out.println("Current Balance:"+presenter.getBalance());
	}


}
