import java.util.ArrayList;

class Bank {
	private ArrayList<Account> accounts;
	public Bank() {
		this.accounts = new ArrayList<>();
	}
	public void openCheckingAccount(String firstName, String lastName, String ssn, double overdraftLimit) {
			if (isValidAge(ssn, 16)) {
				accounts.add(new CheckingAccount(firstName, lastName, ssn, overdraftLimit));
				System.out.println("Thank you, the account number is " + accounts.get(accounts.size() - 1).accountNumber);
			} else {
				System.out.println("Invalid age or underage for checking account.");
			}
	}
	public void openSavingAccount(String firstName, String lastName, String ssn) {
			if (isValidAge(ssn, 5)) {
				accounts.add(new SavingAccount(firstName, lastName, ssn));
				System.out.println("Thank you, the account number is " + accounts.get(accounts.size() - 1).accountNumber);
			} else {
				System.out.println("Invalid age or underage for saving account.");
			}
	}
	public void listAccounts() {
		for (Account account : accounts) {
			System.out.println(account.getAccountInfo() + " : Account Open");
		}
	}
	public void accountStatement(int accountNumber) {
		Account account = findAccount(accountNumber);
		if (account != null) {
			account.printTransactions();
		} else {
			System.out.println("Account not found");
		}
	}
	public void depositFunds(int accountNumber, double amount) {
		Account account = findAccount(accountNumber);
		if (account != null) {
			account.deposit(amount);
			System.out.println("Deposit successful, the new balance is: " + account.balance);
		} else {
			System.out.println("Account not found");
		}
	}
	public void withdrawFunds(int accountNumber, double amount) {
		Account account = findAccount(accountNumber);
		if (account != null) {
			if (account.withdraw(amount)) {
				System.out.println("Withdrawal successful, the new balance is: " + account.balance);
			} else {
				System.out.println("Withdrawal failed, the balance is: " + account.balance);
			}
		} else {
			System.out.println("Account not found");
		}
	}
	public void closeAccount(int accountNumber) {
		Account account = findAccount(accountNumber);
		if (account != null) {
			double balance = account.balance;
			accounts.remove(account);
			System.out.println("Account closed, current balance is " + balance);
		} else {
			System.out.println("Account not found");
		}
	}
	private Account findAccount(int accountNumber) {
		for (Account account : accounts) {
			if (account.accountNumber == accountNumber) {
				return account;
			}
		}
		return null;
	}
	private boolean isValidAge(String ssn, int minAge) {
		//left out because DOB with real date is hard for me
		return true;
	}
}

