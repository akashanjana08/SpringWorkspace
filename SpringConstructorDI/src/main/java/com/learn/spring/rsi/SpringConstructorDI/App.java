package com.learn.spring.rsi.SpringConstructorDI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
       	Resource resource = new ClassPathResource("applicationContext.xml");
     	BeanFactory beanfactory = new XmlBeanFactory(resource);
       	Mobile mob  =(Mobile) beanfactory.getBean("mob");
        mob.list();
    }
}
