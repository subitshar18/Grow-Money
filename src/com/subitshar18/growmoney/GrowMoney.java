package com.subitshar18.growmoney;

import com.subitshar18.growmoney.ui.register.RegisterViewImpl;

public class GrowMoney {

	private static GrowMoney growMoney;
	private String appName="Grow Money";
	private String version="0.0.3";

	private GrowMoney() {

	}
	public static GrowMoney getInstance() {
		if (growMoney == null) {
			growMoney = new GrowMoney();
		}
		return growMoney;
	}

	public void init() {
		new RegisterViewImpl().init();
	}

	public String getAppName() {
		return appName;
	}

	public String getAppVersion() {
		return version;
	}

	public static void main(String[] args) {

		GrowMoney.getInstance().init();

	}

}
