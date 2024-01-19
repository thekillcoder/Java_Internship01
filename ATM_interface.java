import java.util.Scanner;
public class ATM_interface{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize balance, pin, and attempts
        double balance = 1000;
        int pin = 1234;
        int attempts = 3;
        System.out.println("Welcome to the ATM!");
        while (attempts > 0) {
            System.out.print("Please enter your PIN: ");
            int entry = sc.nextInt();
            attempts--;

            if (entry == pin) {
                System.out.println("PIN accepted.");
                break;
            } else if (attempts == 0) {
                System.out.println("Too many incorrect attempts. Card locked.");
                return;
            } else {
                System.out.println("Incorrect PIN. " + attempts + " attempts remaining.");
            }
        }

    
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw funds");
            System.out.println("3. Deposit funds");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your balance is %.2f\n", balance);
                    break;
                case 2:
                    System.out.print("How much would you like to withdraw? ");
                    double withdrawal = sc.nextDouble();
                    if (withdrawal > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdrawal;
                        System.out.printf("Your new balance is %.2f\n", balance);
                    }
                    break;
                case 3:
                    System.out.print("How much would you like to deposit? ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.printf("Your new balance is %.2f\n", balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
