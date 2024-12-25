package com.subitshar18.growmoney.ui.usermanagement;

import com.subitshar18.growmoney.dto.User;

public interface UserManagementModelPresenter {
	//public void updatePhoneNumber(String phonenumber);
	public void printUserDetails(User user);
	public void onSuccess();

}
