package com.subitshar18.growmoney.ui.login;

import java.util.Scanner;


import com.subitshar18.growmoney.GrowMoney;
import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.home.HomeView;
import com.subitshar18.growmoney.ui.register.RegisterView;

public class LoginView {

	private LoginModel loginModel;

	public LoginView() {
		loginModel = new LoginModel(this);
	}

	public void getUserInfo() {
		if (GrowMoneyRepository.getUser() != null) {
			System.out.println("Welcome to " + GrowMoney.getInstance().getAppName() + ".......");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the userName: ");
			String username = scanner.nextLine();
			System.out.println("Enter the Password:");
			String password = scanner.nextLine();
			System.out.println("Please wait...");
			loginModel.getAuthendication(username, password);
		} else {
			System.out.println("Please Register first.");
			new RegisterView().createAccount();
		}
	}

	public void onSuccessfulLogin() {
		System.out.println("Loged in to application successfully....");
		new HomeView().init();
	}

	public void onLoginFailed(String alert) {
		System.out.println(alert);
		getUserInfo();
	}

}
