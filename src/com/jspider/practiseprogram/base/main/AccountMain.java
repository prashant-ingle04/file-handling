package com.jspider.practiseprogram.base.main;

import com.jspider.practiseprogram.base.resource.Account;
import com.jspider.practiseprogram.base.threads.Person1;
import com.jspider.practiseprogram.base.threads.Person2;

public class AccountMain {
public static void main(String[] args) {
	Account account=new Account(200);
	
	Person1 person1=new Person1(account);
	Person2 person2=new Person2(account);
	
	person1.start();
	person2.start();
}
}
