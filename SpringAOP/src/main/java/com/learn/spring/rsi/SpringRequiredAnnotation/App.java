package com.learn.spring.rsi.SpringRequiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MyApplication 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Employee emp = applicationContext.getBean("employee", Employee.class);
    	
        System.out.println("Employee RollNum :"+emp.getRollNum()+"            Employee Name :"+emp.getName());
        
        if(emp.getPanCard()!=null)
           System.out.println("Employee PanNumber : "+emp.getPanCard().getPanNumber());
        else
        	System.out.println("Pan Info Not Found");
    }
}
