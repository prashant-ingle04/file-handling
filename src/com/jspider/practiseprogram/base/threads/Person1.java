package com.jspider.practiseprogram.base.threads;

import com.jspider.practiseprogram.base.resource.Account;

public class Person1 extends Thread{
Account account;

public Person1(Account account) {
	super();
	this.account = account;
}
public void run() {
	account.depositAmount(1000);
	account.withdrawAmount(200);
}
}
