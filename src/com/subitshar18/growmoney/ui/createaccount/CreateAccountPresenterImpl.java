package com.subitshar18.growmoney.ui.createaccount;

public class CreateAccountPresenterImpl implements CreateAccountPresenter,CreateAccountModel {
	private CreateAccountView view;
	private CreateAccountModel model;
	public CreateAccountPresenterImpl(CreateAccountViewImpl createAccountViewImpl) {
		this.view=createAccountViewImpl;
		model=new CreateAccountModelImpl(this);
	}
	@Override
	public void setAccount() {
		// TODO Auto-generated method stub
		model.setAccount();
		
	}

}
