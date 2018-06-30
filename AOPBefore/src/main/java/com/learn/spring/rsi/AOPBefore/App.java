package com.learn.spring.rsi.AOPBefore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	StudentService studentService = appContext.getBean("studentService",StudentService.class);
        System.out.println( studentService.getStudent().getName());
    }
}
