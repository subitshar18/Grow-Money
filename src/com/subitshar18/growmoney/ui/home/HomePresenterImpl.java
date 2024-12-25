package com.subitshar18.growmoney.ui.home;

public class HomePresenterImpl implements HomeModelPresenter,HomeModel {
	private HomeView homeView;
	private HomeModel homeModel;
	public HomePresenterImpl(HomeViewImpl homeViewImpl) {
		this.homeView=homeViewImpl;
		homeModel=new HomeModelImpl(this);
	}

}
