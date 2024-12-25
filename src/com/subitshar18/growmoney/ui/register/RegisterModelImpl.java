package com.subitshar18.growmoney.ui.register;

import com.subitshar18.growmoney.ui.login.LoginViewImpl;

public class RegisterModelImpl implements RegisterModel {
	private RegisterModelPresenter registerModelPresenter;
	
	public RegisterModelImpl(RegisterPresenterImpl registerPresenterImpl) {
		this.registerModelPresenter=registerPresenterImpl;
	}

	public void checkStatus(int choice) {
		if(choice==1) {
			registerModelPresenter.createAccount();
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
