import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1 – Open a Checking account");
            System.out.println("2 – Open Saving Account");
            System.out.println("3 – List Accounts");
            System.out.println("4 – Account Statement");
            System.out.println("5 – Deposit money");
            System.out.println("6 – Withdraw money");
            System.out.println("7 – Close an account");
            System.out.println("8 – Exit");
            System.out.print("Please enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scan.next();
                    System.out.print("Enter last name: ");
                    String lastName = scan.next();
                    System.out.print("Enter social security number#(ssn): ");
                    String ssn = scan.next();
                    System.out.print("Enter overdraft limit: ");
                    System.out.println();
                    
                    double overdraftLimit = scan.nextDouble();
                    bank.openCheckingAccount(firstName, lastName, ssn, overdraftLimit);
                    break;

                case 2:
                    System.out.print("Enter first name: ");
                    String firstNameSaving = scan.next();
                    System.out.print("Enter last name: ");
                    String lastNameSaving = scan.next();
                    System.out.print("Enter social security number: ");
                    System.out.println();
                    
                    String ssnSaving = scan.next();
                    bank.openSavingAccount(firstNameSaving, lastNameSaving, ssnSaving);
                    break;

                case 3:
                    bank.listAccounts();
                    break;

                case 4:
                    System.out.println("Enter account number#: ");
                    System.out.println();
                    
                    int accountNumberStatement = scan.nextInt();
                    bank.accountStatement(accountNumberStatement);
                    break;

                case 5:
                    System.out.print("Enter account number#: ");
                    int accountNumberDeposit = scan.nextInt();
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scan.nextDouble();
                    bank.depositFunds(accountNumberDeposit, depositAmount);
                    break;

                case 6:
                    System.out.print("Enter account number#: ");
                    int accountNumberWithdraw = scan.nextInt();
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawAmount = scan.nextDouble();
                    bank.withdrawFunds(accountNumberWithdraw, withdrawAmount);
                    break;

                case 7:
                    System.out.print("Enter account number# to close: ");
                    int accountNumberClose = scan.nextInt();
                    bank.closeAccount(accountNumberClose);
                    break;

                case 8:
                    System.out.println("Exiting...Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        } while (choice != 8);

        scan.close();
    }
}

