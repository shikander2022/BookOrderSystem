package sf.com.book;

import sf.com.shipping.Shipping;

public class Hbook extends Book {
	Shipping shipping;

	public Hbook(String ISBN, double price) {
		super(ISBN, price);
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public double getFinalPrice() {
		return basePrice + shipping.getShippingCost(basePrice);
	}

}
