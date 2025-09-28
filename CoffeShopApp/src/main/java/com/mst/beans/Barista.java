package com.mst.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope("singleton")
public class Barista {
	
	
	@Autowired
	private CoffeeMachine machine;
	
	
	
	public void serveCoffe(Customer customer)
	{
		
		System.out.println("Barista is serving a coffee for : "+ customer);
		
		
	}
	
	

}
