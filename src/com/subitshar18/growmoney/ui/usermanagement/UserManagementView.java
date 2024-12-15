package com.subitshar18.growmoney.ui.usermanagement;

import java.util.Scanner;

public class UserManagementView {
	UserManagementModel model;
	public UserManagementView() {
		model=new UserManagementModel(this);
	}
	public void editPhoneNumber() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the New Phone Number: ");
		String updatePhoneNumber=scanner.nextLine();
		model.updatePhoneNumber(updatePhoneNumber);
		System.out.println("Phone Number Updated Successfully...");
		model.getUserDetails();
	}
	
	

}
