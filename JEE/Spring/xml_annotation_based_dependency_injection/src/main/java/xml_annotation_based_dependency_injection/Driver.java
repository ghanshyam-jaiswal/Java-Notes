package xml_annotation_based_dependency_injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =new ClassPathXmlApplicationContext("config2.xml");
		Student person=(Student) context.getBean("student"); 
		Mobile mobile=(Mobile) context.getBean("mobile"); 
		
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getList());
		System.out.println(person.getArr()[1]);
		System.out.println(person.getSet());
		System.out.println(person.getMap());
		System.out.println(person.getMobile());
		System.out.println(mobile.getMobile_name());
		
//		context.close();
		
		
		
	}
}
