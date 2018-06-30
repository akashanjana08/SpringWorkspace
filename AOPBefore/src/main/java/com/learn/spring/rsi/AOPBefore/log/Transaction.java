package com.learn.spring.rsi.AOPBefore.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Transaction {

	//@Before("execution(public * getStudent())")
    void initializeTransaction() {
		System.out.println("Initialize Transaction Please wait....");
		beginTransaction();
	}

 void beginTransaction() {
		System.out.println("Begin Transaction Please wait....");
	}
}
