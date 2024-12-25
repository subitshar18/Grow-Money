package com.subitshar18.growmoney.ui.usermanagement;

import java.util.Scanner;

import com.subitshar18.growmoney.dto.User;

public class UserManagementViewImpl implements UserManagementView {
	UserManagementViewPresenter presenter;
	public UserManagementViewImpl() {
		presenter=new UserManagementPresenterImpl(this);
	}
	public void init() {
		editPhoneNumber();
	}
	private void editPhoneNumber() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the New Phone Number: ");
		String updatePhoneNumber=scanner.nextLine();
		presenter.updatePhoneNumber(updatePhoneNumber);	
	}
	
	public void onSuccess() {
		System.out.println("Phone Number Updated Successfully...");
	}
	
	public void getUser() {
		User user= presenter.getUserDetails();
		presenter.checkUser(user);
		
	}
	
	public void printUserDetails(User user) {
		System.out.println("Id:"+user.getId()+"\nName:"+user.getName()+"\nPhone Number:"+user.getPhoneNumber());
	}
	
	

}
