package com.learn.spring.rsi.SpringRequiredAnnotation.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

	/*@Before("allLogger()")
	public void showLog(JoinPoint joinpoint) {
		System.out.println("Aspect Logger Running for Log");
	}

	@Before("allLogger()")
	public void showBug() {
		System.out.println("Aspect Logger Running for bug");
	}
	
	@Before("args(name)")
	public void setterLoggers(String name) {
		System.out.println("setter calling with value "+name);
	}*/
	
	/*@AfterReturning(pointcut="args(data)" , returning = "retuenvalue")
	public void testAfterReturning(String data , String retuenvalue)
	{
		System.out.println("Rerturn SuccessFull" + "   "+retuenvalue);
	}
	
	
	@AfterThrowing(pointcut="args(name)", throwing="throwEx")
	public void catchException(String name ,Exception throwEx)
	{
		System.out.println(throwEx+"    Throw Exc");
	}*/
	
	//@Around("allLogger()")
	@Around("@annotation(com.learn.spring.rsi.SpringRequiredAnnotation.aspect.Loggerable)")
	public Object allAround(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object returnObject = null;
		try {
			System.out.println("Before Advice");
			returnObject =proceedingJoinPoint.proceed();
			System.out.println("After procceed Advice");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("Throws Exeption");
		}
		System.out.println("finally execute");
		return returnObject;
	}
	
	

	@Pointcut("execution(public * get*(..))")
	public void allLogger() {
		System.out.println("Aspect Logger For all ");
	}
	/*
	@Pointcut("within(com.learn.spring.rsi.SpringRequiredAnnotation.model.Circle)")
	public void allClassMethod() {
	}*/
}
