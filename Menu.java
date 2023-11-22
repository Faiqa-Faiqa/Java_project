package Manager;

import Builder.Agreement;

import java.util.Scanner;

public class Menu {
    public static void displayMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Display total amount of money");
        System.out.println("2. Receive new applications");
        System.out.println("3. Display all current insurance agreements");
        System.out.println("4. Display Financial Breakdown");
        System.out.println("5. Break Insurance Agreement");
        System.out.println("6. Move time Forward");
        System.out.println("7. Exit");

        AgreementManager agreementManager = new AgreementManager();
        FinancialManager financialManager = new FinancialManager();
        Scanner scanner = new Scanner(System.in);
        Agreement agreement= new Agreement();
        TimeManager timeManager = new TimeManager();

        boolean exit = false;
        while (!exit) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println("choice : " + choice);
            switch (choice) {
                case 1:
                    financialManager.TotalIncome();
                    break;
                case 2:
                    agreementManager.displayNewApplicationsMenu();
                    break;
                case 3:
                    agreementManager.displayAllAgreementsSubMenu();
                    break;
                case 4:
                    financialManager.FinancialSubMenu();
                    break;
                case 5:
                    agreementManager.breakAgreement();
                    break;
                case 6:
                    timeManager.moveTimeForward();
                    break;


                case 7:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
