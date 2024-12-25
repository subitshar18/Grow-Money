package com.subitshar18.growmoney.ui.moneymanagement;

import com.subitshar18.growmoney.dto.Account;
import com.subitshar18.growmoney.repository.GrowMoneyRepository;

public class MoneyManagementPresenterImpl implements MoneyManagementModelPresenter,MoneyManagementViewPresenter {
	private MoneyManagementModel model;
	private MoneyManagementView view;
	public MoneyManagementPresenterImpl(MoneyManagementViewImpl moneyManagementViewImpl) {
		this.view=moneyManagementViewImpl;
		model=new MoneyManagementModelImpl(this);
	}

	
	

	@Override
	public void withdrewValidation(Double amount) {
		// TODO Auto-generated method stub
		model.withdrewValidation(amount);
		
	}


	@Override
	public void depositValidation(Double amount) {
		// TODO Auto-generated method stub
		model.depositValidation(amount);
		
	}

	@Override
	public void depositeUpdate() {
		// TODO Auto-generated method stub
		view.depositeUpdate();
		
	}

	@Override
	public void withdrewUpdate() {
		// TODO Auto-generated method stub
		view.withdrewUpdate();
		
	}




	@Override
	public Double accountBalance(Account account) {
		return model.accountBalance(account);
		
	}




	@Override
	public void balanceUpdate() {
		view.balanceUpdate();
		
	}

	
}
