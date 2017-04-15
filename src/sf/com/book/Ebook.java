package sf.com.book;

public class Ebook extends Book {

	public Ebook(String ISBN, double price) {
		super(ISBN, price);
	}

	public double getFinalPrice() {
		return basePrice;
	}

}
