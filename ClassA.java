package org.learn.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/*@Component  */// need component when autowiring


public class ClassA {
	@PostConstruct
	public void init() {
		
		System.out.println("init fukcing  of class A was called");
		
	}
	
	  @PreDestroy
		public void  predestroy() {
			
	    	System.out.println("predestroy  of class A was called");
			
		}
		
	public String doSomething() {
		
		
	return "Hello Baler Spring";	
	}
	
	
}
