package com.subitshar18.growmoney.ui.register;

import java.util.Scanner;

import com.subitshar18.growmoney.GrowMoney;
import com.subitshar18.growmoney.dto.User;
import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.login.LoginViewImpl;

public class RegisterPresenterImpl implements RegisterViewPresenter,RegisterModelPresenter {
	RegisterView registerView;
	RegisterModel registerModel;
	
	public RegisterPresenterImpl(RegisterViewImpl registerViewImpl) {
		registerView=registerViewImpl;
		registerModel=new RegisterModelImpl(this);
	}

	@Override
	public void checkStatus(int choice) {
		registerModel.checkStatus(choice);	
	}

	@Override
	public void createAccount() {
		registerView.createAccount();
	}
	
	

}
