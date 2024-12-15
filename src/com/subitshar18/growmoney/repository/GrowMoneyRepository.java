package com.subitshar18.growmoney.repository;

import com.subitshar18.growmoney.dto.Account;
import com.subitshar18.growmoney.dto.User;

public class GrowMoneyRepository {
	
	public static GrowMoneyRepository repository;
	
	private static Account account;
	private static User user;
	
	public static GrowMoneyRepository getInstance() {
		if(repository== null) {
			repository=new GrowMoneyRepository();
		}
		return repository;
	}

	public static Account getAccount() {
		return account;
	}

	public static void setAccount(Account account) {
		GrowMoneyRepository.account = account;
	}

	public static User getUser() {
		return user;
	}

	public static void setUser(User user) {
		GrowMoneyRepository.user = user;
	}
	
	
	
	

}
