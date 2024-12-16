package com.subitshar18.growmoney.ui.home;

import java.util.Scanner;


import com.subitshar18.growmoney.repository.GrowMoneyRepository;
import com.subitshar18.growmoney.ui.createaccount.CreateAccountViewImpl;
import com.subitshar18.growmoney.ui.login.LoginViewImpl;
import com.subitshar18.growmoney.ui.moneymanagement.MoneyManagementViewImpl;
import com.subitshar18.growmoney.ui.usermanagement.UserManagementViewImpl;

public class HomeViewImpl implements HomeView {
	HomePresenter homePresenter;
	public HomeViewImpl() {
		homePresenter=new HomePresenterImpl(this);
	}
	
	public void init() {
		Scanner scanner=new Scanner(System.in);
		while(true){
			try {
			System.out.println("1. Create Account \n2. Show account \n3. Deposite Money \n4. Withdrew Money\n5. Edit profile\n6. Check Balance\n7. logout\n0. Exit");
			String input = scanner.nextLine();
            int choice = Integer.parseInt(input);
			switch(choice) {
			case 1: new CreateAccountViewImpl().init();break;
			case 2: new CreateAccountViewImpl().init();break;
			case 3: new MoneyManagementViewImpl().depositMoney();break;
			case 4: new MoneyManagementViewImpl().withdrewMoney();break;
			case 5: new UserManagementViewImpl().init();break;
			case 6:System.out.println("Account Balance : "+GrowMoneyRepository.getAccount().getBalance());break;
			case 7:new LoginViewImpl().init(); return;
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
