import java.sql.*;

public class DaoImplementation implements Dao{


	@Override
	public boolean saveLibrary(Library library) {
		Connection connection=CreateConnection.getconnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("insert into book values(?,?,?,?,?,?,?,?);");
			preparedStatement.setInt(1, library.getId());
			preparedStatement.setString(2,library.getLocation());
			preparedStatement.setString(3,library.getName());
			preparedStatement.setString(4,library.getEmail());
			preparedStatement.setLong(5,library.getPhone());
			preparedStatement.setString(6,library.getLibrarianName());
			int count=preparedStatement.executeUpdate();
			if(count>0) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean addBook(Book book) {
		
		Connection connection=CreateConnection.getconnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("insert into book values(?,?,?,?,?,?,?,?);");
			preparedStatement.setInt(1, book.getId());
			preparedStatement.setString(2, book.getTitle());
			preparedStatement.setString(3, book.getAuthor());
			preparedStatement.setDouble(4, book.getPrice());
			preparedStatement.setObject(5, Date.valueOf(book.getPublishedDate()));
			preparedStatement.setObject(6, Date.valueOf(book.getIssuedDate()));
			preparedStatement.setString(7, book.getStatus().toString());
			preparedStatement.setInt(8, book.getId());
			int count=preparedStatement.executeUpdate();
			if(count>0) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean isLibraryIdPresent(int library_id) {
		Connection connection=CreateConnection.getconnection();
		try {
			Statement statement=connection.createStatement();
			statement.execute("select library_id from library;");
			ResultSet rs=statement.getResultSet();
			while(rs.next()) {
				if(library_id==rs.getInt(1)) {
					return true;
				}
			}
					
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
		
	@Override
	public int generateLibraryId() {
		Connection connection= CreateConnection.getconnection();
		int id=1;
		try {
			Statement statement =connection.createStatement();
			ResultSet rs=statement.executeQuery("select MAX(library_id)from library;");
			if(rs.next()) {
				id=rs.getInt(1)+1;
			}
					
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return id;
	}
	
	@Override
	public int generateBookId() {
		Connection connection=CreateConnection.getconnection();
		int id=1;
		try {
			Statement statement=connection.createStatement();
			statement.execute("select MAX(library_id)from book;");
			ResultSet rs=statement.getResultSet();
			if(rs.next()) {
				id=rs.getInt(1)+1;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return id;
	}
		
		
		
	

}
