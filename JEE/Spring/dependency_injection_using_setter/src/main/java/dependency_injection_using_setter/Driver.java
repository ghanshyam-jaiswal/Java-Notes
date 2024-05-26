package dependency_injection_using_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person person=(Person) context.getBean("myPerson");
		System.out.println(person.getName());
		System.out.println(person.getAddress());
		
		System.out.println(person.getList());
		System.out.println(person.getSet());
		System.out.println(person.getArr()[1]);
		System.out.println(person.getMap());
		System.out.println(person.getMobile());
		System.out.println(person.getMobile().getModel());
		System.out.println(person.getMobile().getId());
		
		
		
	}
}
