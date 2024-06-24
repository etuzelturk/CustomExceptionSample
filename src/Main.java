import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);
        System.out.println("Current balance: " + account.getBalance());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();

        try {
            account.withdraw(withdrawalAmount);
        } catch (NegativeBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Current balance: " + account.getBalance());
        }
    }
}