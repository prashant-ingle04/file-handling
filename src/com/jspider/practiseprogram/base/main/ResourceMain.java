package com.jspider.practiseprogram.base.main;

import com.jspider.practiseprogram.base.resource.Resource;
import com.jspider.practiseprogram.base.threads.Resource1;
import com.jspider.practiseprogram.base.threads.Resource2;

public class ResourceMain {
	
	public static void main(String[] args) {
		
		Resource resource=new Resource();
		
		Resource1 resource1=new Resource1(resource);
		resource1.setName("T1");
		
		Resource2 resource2=new Resource2(resource);
		resource2.setName("T2");
		
		resource1.start();
		resource2.start();
	}

}
