package xml_annotation_based_dependency_injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

//		@Value(value = "44")	//we can also use it with setter(above the setter) and Constructor.
		private int id;
//		@Value(value = "spring")
		private String name;
		
		@Value(value = "#{{'List',49,'shyam',77}}")
		private List list;
		
		@Value(value = "#{{22,49,88,77}}")
		private int[] arr;
		
		public Map getMap() {
			return map;
		}
		
		@Autowired    					// has a relationship 
		private Mobile mobile;

		public Mobile getMobile() {
			return mobile;
		}

		public void setMobile(Mobile mobile) {
			this.mobile = mobile;
		}

		public void setMap(Map map) {
			this.map = map;
		}

		@Value(value = "#{{1:'map',2:49,3:88}}")
		private Map map;
		
		public int[] getArr() {
			return arr;
		}

		public void setArr(int[] arr) {
			this.arr = arr;
		}

		public Set getSet() {
			return set;
		}

		public void setSet(Set set) {
			this.set = set;
		}

		@Value(value = "#{{'set',22,'shyam',77}}")
		private Set set;
		
		public List getList() {
			return list;
		}

		public void setList(List list) {
			this.list = list;
		}

		
		public Student() {

		}

		public Student(	@Value(value = "50")int id, @Value(value = "constructor_using")String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}
		
//		@Value(value = "44")
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		
//		@Value(value = "spring_Setter")
		public void setName(String name) {
			this.name = name;
		}
		
		
}
