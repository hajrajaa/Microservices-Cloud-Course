package com.mst.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cashier {
	
	
	@PostConstruct
	public void openCashDesk()
	{
		System.out.println("Cash Desk  opened ... ");
	}
	
	
	public void getPayment(Customer customer)
	{
		System.out.println("Cashier get Payment form customer : + " + customer);
		
		
		
	}
	
	@PreDestroy
	public void closeCashDesk()
	{
		System.out.println("Cash Desk  closed ... ");
	}
	
	
	
	
	
	

}
