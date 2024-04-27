package com.jspider.practiseprogram.base.threads;

import com.jspider.practiseprogram.base.resource.Account;

public class Person2 extends Thread{
Account account;

public Person2(Account account) {
	super();
	this.account = account;
}

public void run() {
	account.depositAmount(2000);
	account.withdrawAmount(1000);
}
}
