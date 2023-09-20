import java.util.Scanner;

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayOptions() {
    	System.out.println("Welcome To The ATM");
    	System.out.println("------------------");
        System.out.println("ATM Options:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("------------------");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayOptions();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("------------------");
                    System.out.println("Balance: $" + bankAccount.getBalance());
                    System.out.println("------------------");
                    break;
                    
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                    
                case 3:
                	System.out.println("Enter Your PIN:");
                	int pin = scanner.nextInt();
                	if(pin==8055) {
                    System.out.print("Enter withdrawal amount: $");
                    
                    double withdrawalAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawalAmount);
                	}else {
                		System.out.println("Please Enter The Correct PIN.");
                	
                	}
                    break;
                case 4:
                    System.out.println("Thank you for using ATM");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}

