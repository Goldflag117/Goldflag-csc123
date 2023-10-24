package csc;

public class New_Bank {
    public static void main(String[] args) {
        Bank bank = new Bank();
//setting customer for bank/info/ making both savings and checking account
        Customer customer1 = new Customer("Edward Doe", 25, "123-45-6789", "123 Main St");
        Customer customer2 = new Customer("Edward Doe", 30, "987-65-4321", "456 Oak Ave");
//class
        SavingsAccount savingsAccount = new SavingsAccount(1);
        CheckingAccount checkingAccount = new CheckingAccount(2, 500);
//adding account to bank
        customer1.addAccount(savingsAccount);
        customer1.addAccount(checkingAccount);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
//getting account from bank
        customer1.getAccounts().get(0).deposit(1000);
        customer1.getAccounts().get(1).deposit(500);

        customer1.getAccounts().get(1).withdraw(700);
        
//total accounts made
        customer1.printAccounts();
        
//this is for the account found from bank
        Customer foundCustomer = bank.findCustomer("987-65-4321");
        if (foundCustomer != null) {
            bank.AllAccounts(foundCustomer);
        }
    }
}
