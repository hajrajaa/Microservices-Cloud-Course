package com.mst.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class CoffeeMachine {
	
	
	@Value("Nespresso")
	private String model;
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@PostConstruct
	public void startup()
	{
		System.out.println(model+ " Coffee Machine is start up ........... ");
	}
	
	@PreDestroy
	public void shutdown()
	{
		System.out.println(model + "Coffee Machine is shut down  ........... ");
	}
	

}
