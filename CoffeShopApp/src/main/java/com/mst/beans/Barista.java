package com.mst.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope("singleton")
public class Barista {
	
	
	@Autowired
	private CoffeeMachine machine;
	
	@Autowired
	private Cashier cashier;
	
	
	
	public void serveCoffe(Customer customer)
	{
		customer.orderCoffe();
		System.out.println("Barista is serving a coffee for : "+ customer);
		cashier.getPayment(customer);
		
	}
	
	

}
