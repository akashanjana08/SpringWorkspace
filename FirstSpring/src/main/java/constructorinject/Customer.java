package constructorinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		((AbstractApplicationContext)applicationContext).registerShutdownHook();
		System.out.println(applicationContext);
		Restaurent restaurent = (Restaurent)applicationContext.getBean("restaurent");
		restaurent.getHotTea();
		System.out.println(restaurent.getWaiterNames());
	}
}
