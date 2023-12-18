import java.util.ArrayList;

class Account {
    private static int accountNumberCounter = 1000;
    protected int accountNumber;
    protected String firstName;
    protected String lastName;
    protected String ssn;
    protected double balance;
    protected ArrayList<Transaction> transactions;

    public Account(String firstName, String lastName, String ssn) {
        this.accountNumber = accountNumberCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Credit", amount));
    }

    public boolean withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            transactions.add(new Transaction("Debit", amount));
            return true;
        }
        return false;
    }

    public String getAccountInfo() {
        return accountNumber + " : " + firstName + " " + lastName + " : " + ssn + " : " + balance;
    }

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
        System.out.println("Balance: " + balance);
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String firstName, String lastName, String ssn, double overdraftLimit) {
        super(firstName, lastName, ssn);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            transactions.add(new Transaction("Debit", amount));
            return true;
        }
        return false;
    }

    @Override
    public String getAccountInfo() {
        return super.getAccountInfo() + " (Checking)";
    }
}

class SavingAccount extends Account {
    public SavingAccount(String firstName, String lastName, String ssn) {
        super(firstName, lastName, ssn);
    }

    @Override
    public String getAccountInfo() {
        return super.getAccountInfo() + " (Saving)";
    }
}

