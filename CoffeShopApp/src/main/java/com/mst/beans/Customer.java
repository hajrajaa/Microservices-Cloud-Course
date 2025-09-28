package com.mst.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("proto")
@Scope("prototype")
public class Customer {
	




	@Value("customer1")
	private String name; 
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Value("1")
	private int id; 
	
	

	public void orderCoffe()
	{
		System.out.println("Customer : " + name + ", id: "+ id + " ordered coffee.");
	}
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
	

}
