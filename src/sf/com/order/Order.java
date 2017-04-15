package sf.com.order;

import java.util.ArrayList;
import java.util.List;

import sf.com.book.Book;
import sf.com.exception.BookNotAvailableException;
import sf.com.tax.MockSalesTaxService;
import sf.com.tax.SalesTaxService;

import com.bobswarehouse.BookLookUpService;

public class Order {
	SalesTaxService taxService = new MockSalesTaxService();
	BookLookUpService bookLookUpService = new BookLookUpService();
	List<Book> bookList = new ArrayList<>();

	public void addBook(Book book) throws Exception {
		if (bookLookUpService.lookup(book.getISBN()) > 0) {
			bookList.add(book);
		} else {
			throw new BookNotAvailableException(book.getISBN());
		}
	}

	public double totalPrice() {
		double totalPrice = 0.0;
		for (Book book : bookList) {
			totalPrice = totalPrice
					+ book.getFinalPrice()
					+ taxService.calculateSaleTax(book.getFinalPrice(),
							book.getZipCode());
		}
		return totalPrice;
	}
}
