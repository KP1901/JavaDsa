package ops;

public class Bank {
	private int balance = 1000;

	public Bank() {
		this.balance = balance;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int amount) {
		this.balance += amount;
	}
}
