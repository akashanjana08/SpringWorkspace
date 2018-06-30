package com.learn.spring.rsi.SpringRequiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.rsi.SpringRequiredAnnotation.model.Circle;
import com.learn.spring.rsi.SpringRequiredAnnotation.service.SpaceService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpaceService service = applicationContext.getBean("spaceService", SpaceService.class);
		/*service.getCircle().setNameAndCall("Set and call Dummy Circle");
		service.getCircle().setName("Dummy Circle");
		service.getTrangle().setName("Dummy Trangle");*/
		System.out.println(service.getCircle());
	}
}
