package model;

public class Account {
	private Double balance;

	public Account(Double balance) {
		this.balance = balance;
	}

	public Double getBalance() {
		return balance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Account account = (Account) o;

		return balance != null ? balance.equals(account.balance) : account.balance == null;
	}

	@Override
	public int hashCode() {
		return balance != null ? balance.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Account{" +
				"balance=" + balance +
				'}';
	}
}

