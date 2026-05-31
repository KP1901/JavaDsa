package oops_04.Examples.Abstraction.Ex01;

public class UpiPayment extends Payment {

	private String upiId;

	public UpiPayment(
			int transactionId,
			int amount,
			String upiId
	) {
		super(transactionId, amount);
		this.upiId = upiId;
	}

	@Override
	public void processPayment() {

		if (upiId.contains("@")) {
			System.out.println("UPI Payment Successful");
		} else {
			System.out.println("Invalid UPI ID");
		}
	}
}