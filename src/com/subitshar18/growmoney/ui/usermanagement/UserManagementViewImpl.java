package com.subitshar18.growmoney.ui.usermanagement;

import java.util.Scanner;

public class UserManagementViewImpl implements UserManagementView {
	UserManagementPresenter presenter;
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
		System.out.println("Phone Number Updated Successfully...");
		presenter.getUserDetails();
	}
	
	

}
