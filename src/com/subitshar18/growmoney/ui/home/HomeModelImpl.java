package com.subitshar18.growmoney.ui.home;

import java.util.Scanner;

public class HomeModelImpl implements HomeModel {

	private HomePresenter homePresenter;
	
	public HomeModelImpl(HomePresenterImpl homePresenterImpl) {
		this.homePresenter=homePresenterImpl;
	}

}
