package com.mst;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mst.config.AppConfig;
import com.mst.model.Customer;


public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Customer customer = ctx.getBean(Customer.class);
		
		customer.addCustomer();
		
		customer.addCustomerAround("Hello John");
		customer.addCustomerReturnValue();
		
		
		
		try {
			customer.addCustomerThrowException();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ctx.close();
		
		
		
		
		
		

	}

}
