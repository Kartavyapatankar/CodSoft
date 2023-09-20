public class ATMMain {
    public static void main(String[] args) {
       
        BankAccount bankAccount = new BankAccount(2000);
        ATM atm = new ATM(bankAccount);
        atm.run();
    }
}