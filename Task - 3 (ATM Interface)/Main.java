import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome User you can nuw access ATM functionalities here.");

        ATM atm = new ATM();

        while (true) {
            if (atm.login()) {
                while (true) {

                    System.out.println("Please select your puspose of visit: ");
                    System.out.println("1. Check Transaction History");
                    System.out.println("2. Withdrawal");
                    System.out.println("3. Deposit");
                    System.out.println("4. Transfer");
                    System.out.println("5. Exit");
                    System.out.print("Choice: ");

                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            atm.showTransactionHistory();
                            break;
                        case 2:
                            atm.doWithdraw();
                            break;
                        case 3:
                            atm.doDeposit();
                            break;
                        case 4:
                            atm.doTransfer();
                            break;
                        case 5:
                            System.out.println("Thankyou! for trusting our services.");
                            return;
                        default:
                            System.out.println("Invalid input, select again");
                            break;
                    }
                }
            }
            else {
                System.out.println("Invalid User ID or PIN, try entering again");
            }

        }

    }

}
