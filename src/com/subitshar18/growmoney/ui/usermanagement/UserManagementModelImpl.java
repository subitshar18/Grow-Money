package com.subitshar18.growmoney.ui.usermanagement;

import java.util.Scanner;

import com.subitshar18.growmoney.dto.User;
import com.subitshar18.growmoney.repository.GrowMoneyRepository;

public class UserManagementModelImpl implements UserManagementModel {
	private UserManagementModelPresenter presenter;
	
	public UserManagementModelImpl(UserManagementPresenterImpl userManagementPresenterImpl) {
		this.presenter=userManagementPresenterImpl;
	}

	public void updatePhoneNumber(String phonenumber) {
		changePhoneNumber(phonenumber);		
	}

	private void changePhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		GrowMoneyRepository.getUser().setPhoneNumber(phoneNumber);
		presenter.onSuccess();
		
	}
	
	public User getUser() {
		User user=GrowMoneyRepository.getUser();
		return user;
	}

	public User getUserDetails() {
		User user= GrowMoneyRepository.getUser();
		return user;
	}
	
	public void checkUser(User user) {
	if(user != null) {
		presenter.printUserDetails(user);	
	}
	}
	
	

}
