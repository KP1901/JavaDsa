package ops;

public abstract class Payment {
	private int amount;

	Payment(int amount) {
		this.amount = amount;
	}

	public abstract void processPayment();

	public int showAmount() {
		return this.amount;
	}

	public void addAmount(int newAmount) {
		this.amount = this.amount + newAmount;
	}
}
