public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Starting balance of $1000
        ATM atm = new ATM(account);
        atm.start();
    }
}

