package com.jspider.practiseprogram.base.resource;

public class Shop {
 int availableProduct;

public Shop(int availableProduct) {
	super();
	this.availableProduct = availableProduct;
}
 
   public synchronized void orderProduct(int amount) {
	   
	   System.out.println(amount + "product ordered");
	   
	   if (amount>availableProduct) {
		System.out.println(amount + "product is not available");
		System.out.println("Please wait.....");
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} else {

		availableProduct-=amount;
		System.out.println("The available product is "+availableProduct);
	}
   }
   
   
   public synchronized void restockProduct(int amount) {
	
	   System.out.println(amount + "Product restocked");
	   availableProduct+=amount;
	   System.out.println("the available product is "+availableProduct);
	   this.notify();
}
}
