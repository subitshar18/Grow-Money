package com.subitshar18.growmoney;

import com.subitshar18.growmoney.ui.register.RegisterView;

public class GrowMoney {

	private static GrowMoney growMoney;

	private GrowMoney() {

	}

	public static GrowMoney getInstance() {
		if (growMoney == null) {
			growMoney = new GrowMoney();
		}
		return growMoney;
	}

	public void init() {
		new RegisterView().checkRegisteredUser();
	}

	public String getAppName() {
		return GrowMoney.class.getSimpleName();
	}

	public String getAppVersion() {
		return "0.0.1";
	}

	public static void main(String[] args) {

		GrowMoney.getInstance().init();

	}

}
