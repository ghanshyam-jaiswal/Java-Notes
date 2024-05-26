import java.time.LocalDate;
import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		
		Dao dao=new DaoImplementation();

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Library Management System");
		System.out.println("1. Save Library");
		System.out.println("2. Add Book to Library");
		System.out.println("choose option");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: {
			Library library = new Library();
			System.out.println("Enter Library id");
			library.setId(sc.nextInt());
			System.out.println("Enter Library name");
			library.setName(sc.next());
			System.out.println("Enter Library email");
			library.setEmail(sc.next());
			System.out.println("Enter Library phone");
			library.setPhone(sc.nextLong());
			System.out.println("Enter Librarian name");
			library.setLibrarianName(sc.nextLine());
			System.out.println("Enter Library location");
			library.setLocation(sc.nextLine());
			
			
//			dao.saveLibrary(library);
		}
		case 2: {
			System.out.println("How many book you want to keep");
			int count=sc.nextInt();
			while(count>0) {
				System.out.println("In which library id you want to keep book");
				int id=sc.nextInt();
			
			
			if(dao.isLibraryIdPresent(id)) {
				Book book=new Book();
				book.setId(dao.generateBookId());
				System.out.println("Enter book title");
				book.setTitle(sc.nextLine());
				System.out.println("Enter book author");
				book.setAuthor(sc.next());
				System.out.println("Enter book price");
				book.setPrice(sc.nextDouble());
				System.out.println("Enter book published date yyyy-mm-dd");
				book.setPublishedDate(LocalDate.parse(sc.next()));
				System.out.println("Enter book issued date yyyy-mm-dd");
				book.setIssuedDate(LocalDate.parse(sc.next()));
				System.out.println("select the status \n1.LOST \n2.ISSUED \n3.AVAILABLE");
				int option=sc.nextInt();
				
				switch (option) {
					case 1: {
						book.setStatus(Status.LOST);
						break;
					}
					case 2: {
						book.setStatus(Status.ISSUED);
						break;
					}
					case 3: {
						book.setStatus(Status.AVAILABLE);
						break;
					}
					default:
						break;
				}
				book.setId(id);
				if(dao.addBook(book)) {
					System.out.println("Book added successfully");
				}
				count--;
			}
				else{
					System.out.println("Library is not build yet, select another");
				}
			}
			break;
		}
		
		default:
			break;
		}
			
				
		
		
	}

}
