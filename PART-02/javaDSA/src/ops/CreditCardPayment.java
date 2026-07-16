package ops;

public class CreditCardPayment extends Payment {
	public void processPayment() {
		System.out.println("payment though credit card");
	}

	CreditCardPayment(int amount) {
		super(amount);
	}
}
