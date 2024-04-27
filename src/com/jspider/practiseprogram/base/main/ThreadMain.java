package com.jspider.practiseprogram.base.main;

import com.jspider.practiseprogram.base.threads.MyThread1;
import com.jspider.practiseprogram.base.threads.MyThread2;

public class ThreadMain {
public static void main(String[] args) {
	
	
	MyThread1 thread1=new MyThread1();
	thread1.setName("Thread1");
	thread1.setPriority(9);
	
	
	MyThread2 thread2=new MyThread2();
	
	Thread thread=new Thread(thread2);
	
	thread.setName("Thread1");
	thread.setPriority(3);
	
	
	thread1.start();
	thread.start();
}
}
