package ops;

public class Main {
	public static void main(String[] args) {
		Payment payment = new UPIPayment(1000);
		payment.processPayment();
		payment.addAmount(1000);
		System.out.println(payment.showAmount());
	}
}
