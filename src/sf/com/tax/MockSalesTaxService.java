package sf.com.tax;

import java.util.HashMap;
import java.util.Map;

public class MockSalesTaxService implements SalesTaxService {

	Map<String, Double> salesTaxMap = new HashMap<>();

	public MockSalesTaxService() {
		salesTaxMap.put("75087", 8.25);
		salesTaxMap.put("30080", 6.00);
		salesTaxMap.put("61761", 8.75);
		salesTaxMap.put("85001", 8.60);

	}

	@Override
	public double calculateSaleTax(double price, String zipcode) {
		return price * salesTaxMap.get(zipcode) / 100;
	}

}
