package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAcount, boolean vipFlag) {

		System.out.println(getClass() + ": DOING MY DB WORK: ADD");
	}

	public boolean doWork() {

		System.out.println(getClass() + ": doWork()");
		return false;
	}

}
