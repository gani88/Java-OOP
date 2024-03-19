public class SavingsAccount {
    int balance;
    String nama;
    public SavingsAccount(String nasabah, int initialBalance) {
        nama = nasabah;
        balance = initialBalance;

        System.out.println("An account has been created for you");
    }

    public void checkBalance() {
        System.out.println("==========================================");
        System.out.println("Hello " + nama + ", Welcome to Bank XYZ ");
        System.out.println("Your Balance is : " + balance);
        System.out.println("==========================================\n");
    }

    public void deposit(int amountToDeposit) {
        int newBalance = balance + amountToDeposit;
        balance = newBalance;

        System.out.println("You just deposited : " + amountToDeposit);
    }

    public void withdraw(int amountToWithdraw) {
        int newWithdraw = balance - amountToWithdraw;
        balance = newWithdraw;

        System.out.println("You just withdraw : " + amountToWithdraw);
    }

    public void finish() {
        System.out.println("\nThank you for your patronage " + nama);
    }

    public static void main(String[] args) {
        SavingsAccount xyz = new SavingsAccount("laika", 5_000_000);

        xyz.checkBalance();
        xyz.deposit(4_000_000);
        xyz.withdraw(3_000_000);
        xyz.finish();
    }
}
