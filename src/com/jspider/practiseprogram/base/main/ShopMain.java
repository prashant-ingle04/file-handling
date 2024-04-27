package com.jspider.practiseprogram.base.main;

import com.jspider.practiseprogram.base.resource.Shop;
import com.jspider.practiseprogram.base.threads.Customer;
import com.jspider.practiseprogram.base.threads.Supplier;

public class ShopMain {
	public static void main(String[] args) {
		Shop shop=new Shop(5);
		
		Customer customer=new Customer(shop);
		Supplier supplier=new Supplier(shop);
		
		customer.start();
		supplier.start();
	}

}
