package com.mst.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Customer {
	
	public void addCustomer()
	{
		System.out.println("addCustomer() is running");
	}
	
	public String addCustomerReturnValue()
	{
		System.out.println("addCustomerReturnValue()is running");
		return "Hello MST";
	}
	
	public void addCustomerThrowException() throws Exception
	{ 
		System.out.println("addCustomerThrowException() is running "); 
		throw new Exception ("MST Error"); 
	
	}
	public void addCustomerAround(String name)
	{ 
		System.out.println("addCustomerAround () is running, args :" + name); 
		
	
	}
	

}
