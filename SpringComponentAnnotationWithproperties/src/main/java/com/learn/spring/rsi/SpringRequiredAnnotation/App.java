package com.learn.spring.rsi.SpringRequiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	UserDetails userDet = applicationContext.getBean("userBean",UserDetails.class);
    	System.out.println("UserName : "+userDet.getUserName()+"      UserPasword :"+userDet.getPassword());
    }
}
