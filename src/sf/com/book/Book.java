package sf.com.book;


public abstract class Book {
	final String ISBN;
	Double basePrice;
	String zipCode;

	public String getISBN() {
		return ISBN;
	}

	public Book(String ISBN, double price) {
		this.ISBN = ISBN;
		this.basePrice = price;
	}

	public Double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public abstract double getFinalPrice();

}

