package com.subitshar18.growmoney.ui.createaccount;

import com.subitshar18.growmoney.dto.Account;

public interface CreateAccountView {

	void onSuccess();
	void showAccountDetails(Account account);
	public void accountConfirmation();
	

}
