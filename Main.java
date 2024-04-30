// // Main.java
// public class Main {
//     public static void main(String[] args) {
//         // Create a savings account
//         SavingsAccount savingsAccount = new SavingsAccount("SA123456", "John Doe", 1000, 2.5);

//         // Create a current account
//         CurrentAccount currentAccount = new CurrentAccount("CA789012", "Jane Smith", 2000, 500);

//         // Test savings account
//         savingsAccount.deposit(500);
//         savingsAccount.calculateInterest();
//         savingsAccount.withdraw(2000);

//         // Test current account
//         currentAccount.deposit(1000);
//         currentAccount.withdraw(2500);
//     }
// }




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for savings account
        System.out.println("Enter details for the savings account:");
        System.out.print("Account number: ");
        String savingsAccountNumber = scanner.next();
        System.out.print("Account holder name: ");
        String savingsAccountHolderName = scanner.next();
        System.out.print("Initial balance: ");
        double savingsInitialBalance = scanner.nextDouble();
        System.out.print("Interest rate: ");
        double savingsInterestRate = scanner.nextDouble();

        // Create savings account
        SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsAccountHolderName, savingsInitialBalance, savingsInterestRate);

        // Get input for current account
        System.out.println("\nEnter details for the current account:");
        System.out.print("Account number: ");
        String currentAccountNumber = scanner.next();
        System.out.print("Account holder name: ");
        String currentAccountHolderName = scanner.next();
        System.out.print("Initial balance: ");
        double currentInitialBalance = scanner.nextDouble();
        System.out.print("Overdraft limit: ");
        double overdraftLimit = scanner.nextDouble();

        // Create current account
        CurrentAccount currentAccount = new CurrentAccount(currentAccountNumber, currentAccountHolderName, currentInitialBalance, overdraftLimit);

        // Test savings account
        System.out.println("\nSavings Account Operations:");
        System.out.print("Enter amount to deposit: ");
        double savingsDepositAmount = scanner.nextDouble();
        savingsAccount.deposit(savingsDepositAmount);

        System.out.print("Enter amount to withdraw: ");
        double savingsWithdrawAmount = scanner.nextDouble();
        savingsAccount.withdraw(savingsWithdrawAmount);

        System.out.println("\nCurrent Account Operations:");
        // Test current account
        System.out.print("Enter amount to deposit: ");
        double currentDepositAmount = scanner.nextDouble();
        currentAccount.deposit(currentDepositAmount);

        System.out.print("Enter amount to withdraw: ");
        double currentWithdrawAmount = scanner.nextDouble();
        currentAccount.withdraw(currentWithdrawAmount);

        scanner.close();
    }
}
