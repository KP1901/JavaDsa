package oops_04.Examples.Abstraction.Ex01;

public class CreditCardPayment extends Payment {
	private String cardNumber;
	private int cvv;

	public CreditCardPayment(int transactionId, int amount, String cardNumber, int cvv) {
		super(transactionId, amount);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}

	@Override
	public void processPayment() {
		if (cardNumber.length() == 16) {
			System.out.println("Credit card payment SuccessFul");
		} else {
			System.out.println("Invalid Card Number");
		}
	}
}
