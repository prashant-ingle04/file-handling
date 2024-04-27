package com.jspider.practiseprogram.base.threads;

import com.jspider.practiseprogram.base.resource.Shop;

public class Supplier extends Thread{

	Shop shop;

	public Supplier(Shop shop) {
		super();
		this.shop = shop;
	}
	
	public void run() {
		
		shop.restockProduct(20);
	}
}
