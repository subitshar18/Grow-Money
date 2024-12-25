package com.subitshar18.growmoney.ui.createaccount;

import com.subitshar18.growmoney.dto.Account;

public interface CreateAccountViewPresenter {
	void getAccount();
	void wantCreateAccount(String choice);
	Account gettCurrentAccount();
}
