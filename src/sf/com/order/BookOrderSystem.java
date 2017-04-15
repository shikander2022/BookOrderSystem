package sf.com.order;

import sf.com.book.Hbook;
import sf.com.shipping.GroundShipping;
import sf.com.shipping.SameDayShipping;

public class BookOrderSystem {
	public static void main(String[] args) {

		Order order1 = new Order();
		Hbook b1 = new Hbook("2345", 10.0);
		b1.setZipCode("75087");
		b1.setShipping(new GroundShipping());

		Hbook b2 = new Hbook("25", 10.0);
		b2.setZipCode("75087");
		b1.setShipping(new SameDayShipping());

		try {
			order1.addBook(b1);
			order1.addBook(b2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Order 1 total price: " + order1.totalPrice());

	}

}
