package com.mst.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
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
