package com.jspider.practiseprogram.base.threads;

import com.jspider.practiseprogram.base.resource.Shop;

public class Customer extends Thread{

	Shop shop;

	public Customer(Shop shop) {
		super();
		this.shop = shop;
	}
	
	public void run() {
		shop.orderProduct(10);
	}
}
