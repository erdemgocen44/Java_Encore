package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();

		// set etmek (value, değer atfetmek)

		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(10);
		product1.setImageUrl("image1.jpg");
		product1.setUnitInStock(3);

		// get etmek (okumak,yazdırmak)
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(30);
		product2.setImageUrl("image1.jpg");
		product2.setUnitInStock(3); // null yapmak için setUnitPrice(0) yazılır

		Product product3 = new Product();

		product3.setName("Kitcheaid Kahve Makinesi");
		product3.setUnitPrice(5500);
		product3.setDiscount(20);
		product3.setImageUrl("image1.jpg");
		product3.setUnitInStock(3);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setPhoneNumber("5555555555");
		individualCustomer.setFirstName("Erdem");
		individualCustomer.setLastName("GÖÇEN");

		System.out.println(individualCustomer.getFirstName());
		System.out.println(individualCustomer.getLastName());

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setPhoneNumber("5555555555");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("1111111111");

		Customer[] customers = { individualCustomer, corporateCustomer };
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber());
		}
	}

}
