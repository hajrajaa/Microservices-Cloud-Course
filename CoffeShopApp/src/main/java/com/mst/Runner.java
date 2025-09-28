package com.mst;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mst.beans.Barista;
import com.mst.beans.Cashier;
import com.mst.beans.CoffeeMachine;
import com.mst.beans.Customer;
import com.mst.config.Config;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		
		//CoffeeMachine machine=ctx.getBean(CoffeeMachine.class);
		
		Barista barista= ctx.getBean(Barista.class);
		
		Cashier cashier=ctx.getBean(Cashier.class);
		
		
		Customer cust1= ctx.getBean(Customer.class);
		Customer cust2= ctx.getBean(Customer.class);
		
		
		
		cust2.setId(123);
		cust2.setName("rajaa");
		
		// customers ordered coffee 
		cust1.orderCoffe();
		cust2.orderCoffe();
		
		//Barista is preparing and  serving the coffee for the customers
		barista.serveCoffe(cust1);
		barista.serveCoffe(cust2);
		
		
		//Cashier is getting the payment for the coffee from the customers 
		cashier.getPayment(cust1);
		cashier.getPayment(cust2);
		
		
		
		
		ctx.close();
		
		
		
		
		
		
		
		
		
		

	}

}
