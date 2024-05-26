
public interface Dao {
	 boolean saveLibrary(Library library);
	 public boolean addBook(Book book);
	 public boolean isLibraryIdPresent(int lib_id);
	 public int generateLibraryId();
	 int generateBookId();
}
