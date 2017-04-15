package sf.com.shipping;

public class ThreeDayShipping implements Shipping {

	@Override
	public double getShippingCost(double bookPrice) {
		// TODO Auto-generated method stub
		return bookPrice * 15 / 100;
	}

}
