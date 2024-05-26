package dependency_injection_using_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =new ClassPathXmlApplicationContext("config2.xml");
//		Person person=(Person) context.getBean("myPerson");
		Person person=(Person) context.getBean(Person.class,"myPerson"); // we can also do with this
		
		System.out.println(person.getAddress());
		System.out.println(person.getName());
		
		context.close();
		
		
	}
}
