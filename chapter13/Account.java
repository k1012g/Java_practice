public class Account {
	String accountNumber;
	int balance;

	public static void main(String[] args) {
		Account a = new Account("4649", 1400);
		System.out.println(a);
	}

	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String toString() {
		return "¥" + this.balance + " (口座番号: " + this.accountNumber + ") ";
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof Account) {
			Account a = (Account)obj;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}