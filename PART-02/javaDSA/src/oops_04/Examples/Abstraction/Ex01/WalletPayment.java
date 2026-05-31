package oops_04.Examples.Abstraction.Ex01;

public class WalletPayment extends Payment {

	private int walletBalance;

	public WalletPayment(
			int transactionId,
			int amount,
			int walletBalance
	) {
		super(transactionId, amount);
		this.walletBalance = walletBalance;
	}

	@Override
	public void processPayment() {

		if (walletBalance >= getAmount()) {
			System.out.println("Wallet Payment Successful");
		} else {
			System.out.println("Insufficient Wallet Balance");
		}
	}
}