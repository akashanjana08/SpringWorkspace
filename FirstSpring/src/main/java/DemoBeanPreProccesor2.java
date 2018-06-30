import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPreProccesor2 implements BeanPostProcessor,Ordered{

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    	// TODO Auto-generated method stub
    	System.out.println("postProcessAfterInitialization2");
    	
    	return bean;
    }
    
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    	// TODO Auto-generated method stub
    	System.out.println("postProcessBeforeInitialization2");
    	return bean;
    }

	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
}
