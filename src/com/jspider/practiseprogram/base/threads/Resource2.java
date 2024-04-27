package com.jspider.practiseprogram.base.threads;

import com.jspider.practiseprogram.base.resource.Resource;

public class Resource2 extends Thread{

	Resource resource;

	public Resource2(Resource resource) {
		super();
		this.resource = resource;
	}
	
	public void run() {
		synchronized (resource.resource2) {
			System.out.println(this.getName()+"locked"+resource.resource2);
			synchronized (resource.resource1) {
				System.out.println(this.getName()+"locked"+resource.resource1);
			}
			System.out.println(this.getName()+"relesed"+resource.resource1);
		}
		System.out.println(this.getName()+"relesed"+resource.resource2);
	}
}
