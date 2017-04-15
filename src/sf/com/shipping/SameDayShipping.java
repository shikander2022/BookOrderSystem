package sf.com.shipping;

public class SameDayShipping implements Shipping {

	@Override
	public double getShippingCost(double bookPrice) {

		return bookPrice * 20 / 100;
	}

}
