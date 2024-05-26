import java.util.List;

public class Library {

		private int id;
		private String name;
		private String email;
		private long phone;
		private String librarianName;
		private String location;
		private List<Book> books;
		
	    
		public Library() {
			super();
			
		}
	public Library(int id, String name, String email, long phone, String librarianName, String location,List<Book> books) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.librarianName = librarianName;
			this.location = location;
			this.books = books;
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getLibrarianName() {
		return librarianName;
	}
	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	
}
