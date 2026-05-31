package oops_04.Examples.Abstraction.Ex01;

public class Main {

	public static void main(String[] args) {

		Payment payments[] = {
				new CreditCardPayment(
						101,
						5000,
						"1234567890123456",
						123
				),

				new UpiPayment(
						102,
						1200,
						"rahul@upi"
				),

				new WalletPayment(
						103,
						3000,
						5000
				)
		};

		for (Payment p : payments) {

			p.showTransactionDetails();
			p.processPayment();

			System.out.println("----------------");
		}
	}
}