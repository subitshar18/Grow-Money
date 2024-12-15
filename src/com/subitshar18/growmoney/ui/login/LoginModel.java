package com.subitshar18.growmoney.ui.login;

import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.register.RegisterView;

public class LoginModel {
	LoginView loginView;

	public LoginModel(LoginView loginView) {
		this.loginView=loginView;
	}

	public void getAuthendication(String username, String password) {
		String acutualUsername=GrowMoneyRepository.repository.getInstance().getUser().getEmail();
		String actualPassword=GrowMoneyRepository.repository.getInstance().getUser().getPassword();
		if(username != null && password != null ) {
			if(!username.equals(acutualUsername)) {
				loginView.onLoginFailed("Invalid Username....");
			}
			else if(!password.equals(actualPassword)) {
				loginView.onLoginFailed("Invalid password....");	
			}
			else {
				loginView.onSuccessfulLogin();
			}
		}
		else {
			System.out.println("Please Register in to account.");
			new RegisterView().createAccount();
		}
		
	}
	
	

}
