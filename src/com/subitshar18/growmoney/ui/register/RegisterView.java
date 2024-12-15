package com.subitshar18.growmoney.ui.register;

import java.util.Scanner;


import com.subitshar18.growmoney.GrowMoney;
import com.subitshar18.growmoney.dto.User;
import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.login.LoginView;

public class RegisterView {

	RegisterModel registerModel;

	public RegisterView() {
		registerModel = new RegisterModel(this);
	}

	public void checkRegisteredUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------Welcome to " + GrowMoney.getInstance().getAppName() + "----------------");
		System.out.println("1. New User- Create Account");
		System.out.println("2. If already have account- Login to Account");
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		registerModel.checkStatus(choice);

	}

	public void createAccount() {
		System.out.println("------------------Welcome to "+GrowMoney.getInstance().getAppName()+"----------------");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the fullname:");
		String name=scanner.nextLine();
		System.out.println("Enter the username:");
		String username=scanner.nextLine();
		System.out.println("Enter the password:");
		String password=scanner.nextLine();
		System.out.println("Enter Phone number:");
		String phoneNumber=scanner.nextLine();
		System.out.println("Acoount created successfully...");
		GrowMoneyRepository.setUser(new User(name,phoneNumber,username,password));
		new LoginView().getUserInfo();
	}

}
