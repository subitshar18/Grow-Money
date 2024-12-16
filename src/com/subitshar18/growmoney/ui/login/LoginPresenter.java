package com.subitshar18.growmoney.ui.login;

public interface LoginPresenter {
	public void getAuthendication(String username, String password);
	public void onSuccessfulLogin();
	public void onLoginFailed(String alert);


}
