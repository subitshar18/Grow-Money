package com.subitshar18.growmoney.ui.register;

import com.subitshar18.growmoney.ui.login.LoginView;

public class RegisterModel {
	RegisterView registerView;
	
	public RegisterModel(RegisterView registerView) {
		this.registerView=registerView;
	}

	public void checkStatus(int choice) {
		if(choice==1) {
			registerView.createAccount();
		}
		else if(choice==2) {
			new LoginView().getUserInfo();
		}
		else {
			System.out.println("Enter the Vaild Choice");
			registerView.checkRegisteredUser();
		}
		
	}
	
	

}
