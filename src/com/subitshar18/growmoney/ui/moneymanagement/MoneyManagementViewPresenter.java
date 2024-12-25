package com.subitshar18.growmoney.ui.moneymanagement;

import com.subitshar18.growmoney.dto.Account;

public interface MoneyManagementViewPresenter {
	void depositValidation(Double amount);
	void withdrewValidation(Double amount);
	Double accountBalance(Account account);

}
