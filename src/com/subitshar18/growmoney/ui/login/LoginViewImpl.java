package com.subitshar18.growmoney.ui.login;

import java.util.Scanner;



import com.subitshar18.growmoney.GrowMoney;
import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.home.HomeViewImpl;
import com.subitshar18.growmoney.ui.register.RegisterViewImpl;

public class LoginViewImpl implements LoginView{

	private LoginPresenter loginPresenter;

	public LoginViewImpl() {
		loginPresenter = new LoginPresenterImpl(this);
		
	}

	public void init() {
		if (GrowMoneyRepository.getUser() != null) {
			System.out.println("Welcome to " + GrowMoney.getInstance().getAppName() + ".......");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the userName: ");
			String username = scanner.nextLine();
			System.out.println("Enter the Password:");
			String password = scanner.nextLine();
			System.out.println("Please wait...");
			loginPresenter.getAuthendication(username, password);
		} else {
			System.out.println("Please Register first.");
			new RegisterViewImpl().createAccount();
		}
	}

	public void onSuccessfulLogin() {
		System.out.println("Loged in to application successfully....");
		new HomeViewImpl().init();
	}

	public void onLoginFailed(String alert) {
		System.out.println(alert);
		new LoginViewImpl().init();
	}

}
