package csc;

import java.util.ArrayList;
//start of accounts and account numbers/balance.
class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
//deposit method(putting money in)
    public void deposit(double amount) {
        balance += amount;
    }
//withdraw method (taking money out/balance)
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
//getters and setters
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
//printing bank statement/info
    public void printStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

//separate checking account 
class CheckingAccount extends Account {
    private double creditLimit;
//checking account constructor
    public CheckingAccount(int accountNumber, double creditLimit) {
        super(accountNumber);
        this.creditLimit = creditLimit;
    }
//getter and setter for checking account
    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
//savings account
class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber) {
        super(accountNumber);
    }
}

//new person
class Customer {
    private String name;
    private int age;
    private String socialSecurityNumber;
    private String address;
    private ArrayList<Account> accounts;
    
//constructors
    public Customer(String name, int age, String socialSecurityNumber, String address) {
        this.name = name;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
        this.address = address;
        this.accounts = new ArrayList<>();
    }
//account settings/ add/remove/get/print
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public boolean removeAccount(Account account) {
        return accounts.remove(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void printAccounts() {
        System.out.println("Accounts for " + name + ":");
        for (Account account : accounts) {
            account.printStatement();
        }
    }
//getter SSN
	public Object getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
}
//actual bank class
class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }
//if account found then return customer
    public Customer findCustomer(String socialSecurityNumber) {
        for (Customer customer : customers) {
            if (customer.getSocialSecurityNumber().equals(socialSecurityNumber)) {
                return customer;
            }
        }
        //if none then return nothing
       return null;
    }
// accounts
    public void AllAccounts(Customer customer) {
        customer.printAccounts();
    }
    
}
