package com.subitshar18.growmoney.ui.usermanagement;

public class UserManagementPresenterImpl  implements UserManagementPresenter,UserManagementModel {
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
	public void getUserDetails() {
		// TODO Auto-generated method stub
		model.getUserDetails();
	}

}
