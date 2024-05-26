package dependency_injection_using_constructor;

public class Person {

	private String name;	
	private String address;
	
	
	
	public void m1() {
		System.out.println("method m1()");
	}
	public void m2() {
		System.out.println("method m2()");
	}
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
