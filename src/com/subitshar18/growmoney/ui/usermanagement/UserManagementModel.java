package com.subitshar18.growmoney.ui.usermanagement;

import com.subitshar18.growmoney.dto.User;

public interface UserManagementModel {
	//public User getUserDetails();
	public void updatePhoneNumber(String phonenumber);
	User getUserDetails();
	void checkUser(User user);
}
