package com.subitshar18.growmoney.ui.createaccount;

import com.subitshar18.growmoney.dto.Account;

public class CreateAccountPresenterImpl implements CreateAccountViewPresenter,CreateAccountModelPresenter{
	private CreateAccountView view;
	private CreateAccountModel model;
	public CreateAccountPresenterImpl(CreateAccountViewImpl createAccountViewImpl) {
		this.view=createAccountViewImpl;
		model=new CreateAccountModelImpl(this);
	}
	//call from view
	@Override
	public void onSuccess() {
		view.onSuccess();
		
	}
	@Override
	public void showAccountDetails(Account account) {
		// TODO Auto-generated method stub
		view.showAccountDetails(account);
		
	}
	@Override
	public void getAccount() {
		model.getAccount();
	}
	@Override
	public void wantCreateAccount(String choice) {
		model.wantCreateAccount(choice);
	}
	@Override
	public void accountConfirmation() {
		view.accountConfirmation();
	}
	@Override
	public Account gettCurrentAccount() {
		return model.getCurrentAccount();
	}







}
