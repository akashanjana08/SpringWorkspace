package com.learn.spring.rsi.SpringBulbExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       	BulbService bulbService1   = (BulbService)applicationContext.getBean("bulbServiceObj");
        System.out.println( bulbService1 );
        
        BulbService bulbService2   = (BulbService)applicationContext.getBean("bulbServiceObj");
        System.out.println( bulbService2 );
    }
}
