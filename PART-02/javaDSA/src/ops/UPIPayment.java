package ops;

public class UPIPayment extends Payment {
	public void processPayment() {
		System.out.println("payment though UPI");
	}

	UPIPayment(int amount) {
		super(amount);
	}
}
