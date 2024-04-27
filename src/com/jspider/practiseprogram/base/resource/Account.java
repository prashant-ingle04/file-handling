package com.jspider.practiseprogram.base.resource;

public class Account {
	
	int availablebalance;

	public Account(int availablebalance) {
		super();
		this.availablebalance = availablebalance;
	}
	
	public void checkBalance() {
		System.out.println("the available balnce is "+availablebalance);
	}
	
	public synchronized void depositAmount(int amount) {
		System.out.println(amount + "deposited successfully");
		availablebalance+=amount;
		checkBalance();
	}
	
	public synchronized void withdrawAmount(int amount) {
		System.out.println(amount + "Withdraw");
		if (amount>availablebalance) {
			System.out.println("Insufficient balance" );
		}else {
		availablebalance-=amount;
		checkBalance();
		}
	}

}
