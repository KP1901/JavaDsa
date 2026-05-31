package oops_04.Examples.Abstraction.Ex01;

abstract class Payment {
	private int transactionId;
	private int amount;

	public Payment(int transactionId, int amount) {
		this.transactionId = transactionId;
		this.amount = amount;
	}
	public int getAmount() {
		return amount;
	}

	public abstract void processPayment();

	public void showTransactionDetails() {
		System.out.println("Transaction Id : " + transactionId);
		System.out.println("Amount : " + amount);
	}


}
