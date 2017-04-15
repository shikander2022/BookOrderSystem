package sf.com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sf.com.book.Ebook;
import sf.com.book.Hbook;
import sf.com.exception.BookNotAvailableException;
import sf.com.order.BookOrderSystem;
import sf.com.order.Order;
import sf.com.shipping.GroundShipping;
import sf.com.shipping.SameDayShipping;
import sf.com.shipping.ThreeDayShipping;

public class BOSTest {
	// Book b1 = new Book();
	Ebook e1 = new Ebook("2345", 20);
	GroundShipping gs1 = new GroundShipping();
	BookNotAvailableException bnae1 = new BookNotAvailableException("2222");
	BookOrderSystem bos = new BookOrderSystem();
	// Shipping s1 = new Shipping();
	Hbook hbook = new Hbook("1399", 15);
	Order order = new Order();
	SameDayShipping samedayshipping = new SameDayShipping();
	ThreeDayShipping tds = new ThreeDayShipping();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ebookTest() {
		//String res = e1.setBasePrice(8.25);
		String res = e1.getISBN();
		assertEquals(res, "2345");
		double res1 = e1.getFinalPrice();
		assertEquals(res1, 20);

	}

	@Test
	public void groundShipTest() {
		double res = gs1.getShippingCost(20);
		assertEquals(res, 20);
	}

	@Test
	public void bookNotAvailableExceptionTest() {
		String res = bnae1.getMessage();
		assertEquals(res, "some message testing to make it fail");
	}

	@Test
	public void hbookTest() {
		String res = hbook.getISBN();
		assertEquals(res, 1399);
		
		// String res0= hbook.setShipping();
		// double res1 = hbook.getFinalPrice();
		// assertTrue(res1 != 20);
	}

	@Test
	public void bookOrderSystemTest() {
		Class<? extends BookOrderSystem> res = bos.getClass();
		assertEquals(res, bos.getClass());
	}

	@Test
	public void orderTest() {
		double res = order.totalPrice();
		assertEquals(res, -300);
	}

	@Test
	public void sameDayShippingTest() {
		double res = samedayshipping.getShippingCost(20);
		assertEquals(res, 500);
	}

	@Test
	public void threeDayShippingTest() {
		double res = tds.getShippingCost(20);
		assertEquals(res, 20);
	}

}
