package com.subitshar18.growmoney.ui.login;

import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.home.HomeViewImpl;
import com.subitshar18.growmoney.ui.register.RegisterViewImpl;

public class LoginModelImpl implements LoginModel {
	LoginPresenter loginPresenter;

	public LoginModelImpl(LoginPresenterImpl loginPresenterImpl) {
		this.loginPresenter=loginPresenterImpl;
	}

	public void getAuthendication(String username, String password) {
		String acutualUsername=GrowMoneyRepository.repository.getInstance().getUser().getEmail();
		String actualPassword=GrowMoneyRepository.repository.getInstance().getUser().getPassword();
		if(username != null && password != null ) {
			if(!username.equals(acutualUsername)) {
				loginPresenter.onLoginFailed("Invalid Username....");
			}
			else if(!password.equals(actualPassword)) {
				loginPresenter.onLoginFailed("Invalid password....");	
			}
			else {
				loginPresenter.onSuccessfulLogin();
			}
		}
		else {
			System.out.println("Please Register in to account.");
			new RegisterViewImpl().createAccount();
		}
		
	}
	
	
	

}
