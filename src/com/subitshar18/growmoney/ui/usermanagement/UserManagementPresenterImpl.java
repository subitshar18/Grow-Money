package com.subitshar18.growmoney.ui.usermanagement;

import com.subitshar18.growmoney.dto.User;

public class UserManagementPresenterImpl  implements UserManagementViewPresenter,UserManagementModelPresenter {
	private UserManagementView view;
	private UserManagementModel model;
	public UserManagementPresenterImpl(UserManagementViewImpl userManagementViewImpl) {
		// TODO Auto-generated constructor stub
		this.view=userManagementViewImpl;
		model=new UserManagementModelImpl(this);
	}
	@Override
	public void updatePhoneNumber(String phonenumber) {
		// TODO Auto-generated method stub
		model.updatePhoneNumber(phonenumber);
		
	}
	@Override
	public void onSuccess() {
		// TODO Auto-generated method stub
		view.onSuccess();
		
	}
	
	@Override
	public User getUserDetails() {
		// TODO Auto-generated method stub
		return model.getUserDetails();
	}
	@Override
	public void checkUser(User user) {
		// TODO Auto-generated method stub
		model.checkUser(user);
		
	}
	@Override
	public void printUserDetails(User user) {
		// TODO Auto-generated method stub
		view.printUserDetails(user);
		
	}
	

}
