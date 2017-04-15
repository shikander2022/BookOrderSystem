package sf.com.exception;

public class BookNotAvailableException extends Exception {

	public BookNotAvailableException(String isbn) {
		super(String.format("Book %s is not available.", isbn));
	}


}
