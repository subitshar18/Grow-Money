package com.subitshar18.growmoney.ui.moneymanagement;

import java.util.Scanner;

import com.subitshar18.growmoney.repository.GrowMoneyRepository;

public class MoneyManagementView {
	MoneyManagementModel model;
	public MoneyManagementView() {
		model=new MoneyManagementModel(this);
		}
	public void depositeMoney() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the money want to deposite: ");
		Double amount=scanner.nextDouble();
		model.depositeValidation(amount);
		System.out.println("Money Deposite into your Account Successfully");
		System.out.println("Current Balance:"+GrowMoneyRepository.getAccount().getBalance());
	}
	public void withdrewMoney() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the money want to deposite: ");
		Double amount=scanner.nextDouble();
		model.withdrewValidation(amount);
		System.out.println("Money Withdrew from your Account Successfully");
		System.out.println("Current Balance:"+GrowMoneyRepository.getAccount().getBalance());
		
	}

}
