package dependency_injection_using_setter;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

	String name;	// we can also make it private
	String address;
	List list;
	Set set;
	int [] arr;
	Map map;
	Mobile mobile;
	
	
	
	public Person(String name, String address, List list, Set set, int[] arr, Map map, Mobile mobile) {
		super();
		this.name = name;
		this.address = address;
		this.list = list;
		this.set = set;
		this.arr = arr;
		this.map = map;
		this.mobile = mobile;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
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
