package com.mst.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.mst.beans.Customer;



@Component
public class CustomBeanLogger implements BeanPostProcessor {
	
	
	
	@Override
	 public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		
		if (bean instanceof Customer)
		{
			System.out.println("Before Initializing Customer bean :"+ beanName);
		}
		
	
		
		return bean;
	}
	
	
	@Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		
		if (bean instanceof Customer)
		{

			System.out.println("After Initializing  Customer bean :"+ beanName);
		}
		
		return bean;
	}
	

	
	

}
