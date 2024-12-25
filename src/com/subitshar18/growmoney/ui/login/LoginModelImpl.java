package com.subitshar18.growmoney.ui.login;

import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.home.HomeViewImpl;
import com.subitshar18.growmoney.ui.register.RegisterViewImpl;

public class LoginModelImpl implements LoginModel {
	LoginModelPresenter loginModelPresenter;

	public LoginModelImpl(LoginPresenterImpl loginPresenterImpl) {
		this.loginModelPresenter=loginPresenterImpl;
	}

	public void getAuthendication(String username, String password) {
		String acutualUsername=GrowMoneyRepository.repository.getInstance().getUser().getEmail();
		String actualPassword=GrowMoneyRepository.repository.getInstance().getUser().getPassword();
		if(username != null && password != null ) {
			if(!username.equals(acutualUsername)) {
				loginModelPresenter.onLoginFailed("Invalid Username....");
			}
			else if(!password.equals(actualPassword)) {
				loginModelPresenter.onLoginFailed("Invalid password....");	
			}
			else {
				loginModelPresenter.onSuccessfulLogin();
			}
		}
		else {
			System.out.println("Please Register in to account.");
			new RegisterViewImpl().createAccount();
		}
		
	}
	
	
	

}
