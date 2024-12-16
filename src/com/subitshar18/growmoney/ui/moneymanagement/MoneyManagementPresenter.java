package com.subitshar18.growmoney.ui.moneymanagement;

public interface MoneyManagementPresenter {
	public void depositMoney();
	public void depositeUpdate();
	public void withdrewUpdate();
	public Double getBalance();
	public void withdrewMoney();
	public void depositValidation(Double amount);
	public void withdrewValidation(Double amount);
}
