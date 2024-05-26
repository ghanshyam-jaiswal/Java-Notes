import java.sql.Connection;

public class CreateConnection {

	
	public static Connection getconnection() {
		String url="jdbc:postgresql://localhost:5432/library_management_system";
		String user="postgres";
		String password="root";
		Connection connection=null;
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}

}
