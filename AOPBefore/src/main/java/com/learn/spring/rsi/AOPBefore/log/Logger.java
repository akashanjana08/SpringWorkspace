package com.learn.spring.rsi.AOPBefore.log;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Logger {
	@Before("allMethods()")
	public void logAdvice(JoinPoint joinPoint)
	{
		System.out.println("Logging Advice  "+joinPoint.toString());
		
	}
	
	@Pointcut("execution(public * *())")
	public void allMethods()
	{}
	
}
