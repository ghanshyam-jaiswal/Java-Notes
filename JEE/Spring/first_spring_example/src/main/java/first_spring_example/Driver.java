package first_spring_example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person p=(Person)context.getBean("myPerson");
		p.work();
		p.work();
	}
}
