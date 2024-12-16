package com.subitshar18.growmoney.ui.register;

import com.subitshar18.growmoney.ui.login.LoginViewImpl;

public class RegisterModelImpl implements RegisterModel {
	private RegisterPresenter registerPresenter;
	
	public RegisterModelImpl(RegisterPresenterImpl registerPresenterImpl) {
		this.registerPresenter=registerPresenterImpl;
	}

	public void checkStatus(int choice) {
		if(choice==1) {
			registerPresenter.createAccount();
		}
		else if(choice==2) {
			new LoginViewImpl().init();
		}
		else {
			System.out.println("Enter the Vaild Choice");
			new RegisterViewImpl().init();
		}
	}
	
	

}
