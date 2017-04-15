package sf.com.shipping;

public class GroundShipping implements Shipping {

	@Override
	public double getShippingCost(double bookPrice) {
		return bookPrice * 5 / 100;
	}

}
