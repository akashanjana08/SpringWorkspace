package com.learn.spring.rsi.SpringBeanLifeCycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Resource resource = new ClassPathResource("applicationContext.xml");
    	//BeanFactory beanFactory = new XmlBeanFactory(resource);
    	
    	ApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationContext.xml");
       	((AbstractApplicationContext)appcontext).registerShutdownHook();
    	Student student =(Student) appcontext.getBean("student");
        student.showMessage();
    }
}
