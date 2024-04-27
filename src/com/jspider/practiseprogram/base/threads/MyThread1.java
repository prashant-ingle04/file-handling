package com.jspider.practiseprogram.base.threads;

public class MyThread1 extends Thread{

	
	public void run() {
		
		System.out.println("The name of the thread is "+this.getName());
		System.out.println("The priority of the thread is"+this.getPriority());
	}
}
