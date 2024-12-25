package com.subitshar18.growmoney.ui.home;

import java.util.Scanner;

public class HomeModelImpl implements HomeModel {

	private HomeModelPresenter homeModelPresenter;
	
	public HomeModelImpl(HomePresenterImpl homePresenterImpl) {
		this.homeModelPresenter=homePresenterImpl;
	}

}
