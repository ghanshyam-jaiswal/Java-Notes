import java.sql.*;

public class LibraryTable {

	public static void main(String[] args) {
	
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/library_management_system";
			String user="postgres";
			String password="root";
			Connection connection=DriverManager.getConnection(url,user,password);
			Statement statement =connection.createStatement();
			statement.execute("create table library(Library_id numeric primary key,Library_name varchar")
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
