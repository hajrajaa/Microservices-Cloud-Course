package com.mst.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

public class LoggingAscpect {
	
	
	// section 1 - implement log before for the method addCustomer
	@Before("execution(*com.mst.model.Customer.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint)
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"); 
		System.out.println("logBefore() is running!"); 					
		System.out.println("MST Spring : " +joinPoint.getSignature().getName()); 
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"); 
	}
	
	// section 2 - implement log after for all the Customer methods 
	@After("execution(* com.mst.model.Customer.*(..))")
	public void logAfter (JoinPoint joinPoint)
	{
		System.out.println("*********************************************************"); 
		System.out.println("logAfter() is running!"); 					
		System.out.println("MST Spring : " +joinPoint.getSignature().getName()); 
		System.out.println("*********************************************************");
		
	}
	
	// section 3 - implement log after returning for addCustomerReturnValue method. 
	 @AfterReturning(pointcut = "execution(* com.mst.model.Customer.addCustomerReturnValue(..))" ,returning= "result")
	 public void logAfterReturnning(JoinPoint joinpoint , Object result) 
	 {

			System.out.println("----------------------------------------------------");
			System.out.println("logAfterReturning() is running!");
			System.out.println("the  : " + joinpoint.getSignature().getName());
			System.out.println("Method returned value is : " + result);
			System.out.println("----------------------------------------------------");
			
	}
	 
	 // section 4 - implement log after Throwing for addCustomerThrowException method. 
	 @AfterThrowing (pointcut = "execution(* com.mst.model.Customer.addCustomerThrowException(..))" ,throwing= "error")
	public void logAfterThrowing(JoinPoint joinPoint , Throwable error)
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.err.println("logAfterThrowing() is running!");
		System.err.println("the : " + joinPoint.getSignature().getName());
		System.err.println("Exception : " + error);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
	}
	 
	 // section 5 - implement log around for addCustomerAround function 
	 @Around("execution(* com.mst.model.Customer.addCustomerAround(..))")
	 public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		 System.out.println("/////////////////////////////////////////////////////////");
		 System.out.println("LogAround() is running!");
		 System.out.println("MST Around method : " +joinPoint.getSignature().getName());
		 System.out.println("MST Around arguments : " + Arrays.toString(joinPoint.getArgs())); 
		 System.out.println("Around before is running!"); 
		 
		 joinPoint.proceed(); //continue on the intercepted method
		 System.out.println("Around after is running!");
		 System.out.println("/////////////////////////////////////////////////////////");
		 
		 
	 }
	 

}
