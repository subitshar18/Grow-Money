package com.subitshar18.growmoney.ui.usermanagement;

import java.util.Scanner;

import com.subitshar18.growmoney.dto.User;
import com.subitshar18.growmoney.repository.GrowMoneyRepository;

public class UserManagementModelImpl implements UserManagementModel {
	private UserManagementPresenter presenter;
	private User user;
	
	

	public UserManagementModelImpl(UserManagementPresenterImpl userManagementPresenterImpl) {
		this.presenter=userManagementPresenterImpl;
	}

	public void updatePhoneNumber(String phonenumber) {
		GrowMoneyRepository.getUser().setPhoneNumber(phonenumber);	
	}

	public void getUserDetails() {
		user=GrowMoneyRepository.getUser();
		if(user != null) {
			System.out.println("Id:"+user.getId()+"\nName:"+user.getName()+"\nPhone Number:"+user.getPhoneNumber());
		}	
	}
	
	

}
