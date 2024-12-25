package com.subitshar18.growmoney.ui.login;

import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.home.HomeViewImpl;
import com.subitshar18.growmoney.ui.register.RegisterViewImpl;

public class LoginPresenterImpl implements LoginViewPresenter,LoginModelPresenter {
	
	private LoginView loginView;
	private LoginModel loginModel;

	public LoginPresenterImpl(LoginViewImpl loginViewImpl) {
		loginView=loginViewImpl;
		this.loginModel=new LoginModelImpl(this);
	}

	@Override
	public void getAuthendication(String username, String password) {
		loginModel.getAuthendication(username, password);	
	}

	@Override
	public void onSuccessfulLogin() {
		loginView.onSuccessfulLogin();
		
	}

	@Override
	public void onLoginFailed(String alert) {
		loginView.onLoginFailed(alert);
		
	}

}
