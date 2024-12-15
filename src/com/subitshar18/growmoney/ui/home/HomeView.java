package com.subitshar18.growmoney.ui.home;

import java.util.Scanner;


import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.createaccount.CreateAccountView;
import com.subitshar18.growmoney.ui.login.LoginView;
import com.subitshar18.growmoney.ui.moneymanagement.MoneyManagementView;
import com.subitshar18.growmoney.ui.usermanagement.UserManagementView;

public class HomeView {
	HomeModel model;
	public HomeView() {
		model=new HomeModel(this);
	}
	
	public void init() {
		Scanner scanner=new Scanner(System.in);
		while(true){
			try {
			System.out.println("1. Create Account \n2. Show account \n3. Deposite Money \n4. Withdrew Money\n5. Edit profile\n6. Check Balance\n7. logout\n0. Exit");
			String input = scanner.nextLine();
            int choice = Integer.parseInt(input);
			switch(choice) {
			case 1: new CreateAccountView().init();break;
			case 2: new CreateAccountView().init();break;
			case 3: new MoneyManagementView().depositeMoney();break;
			case 4: new MoneyManagementView().withdrewMoney();break;
			case 5: new UserManagementView().editPhoneNumber();break;
			case 6:System.out.println("Account Balance : "+GrowMoneyRepository.getAccount().getBalance());break;
			case 7:new LoginView().getUserInfo(); return;
			case 0:System.out.println("Thanking you for using Our Application..");return;
			default: System.out.println("Enter the vaild Choice."); break;
			}
			}
			catch(NumberFormatException e){
				System.out.println("Invalid input....");
			}
			
		}
	}
}
