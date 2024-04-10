package access_scope;

public class CheckingAccount {
    public String name;
    private int balance;
    private String id;
    private double interestRate = 0.02;

    public CheckingAccount(String inputName, int inputBalance) {
        name = inputName;
        balance = inputBalance;
    }

    public CheckingAccount(String inputName, int inputBalance, String inputId) {
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addFunds(int fundsToAdd) {
        balance += fundsToAdd;
        System.out.println("Adding " + fundsToAdd + " to this account");
    }

    public void getInfo() {
        System.out.println("This checking account belongs to " + name + ". It has " + balance + " dollars in it.");
        System.out.println("Next month's interest : " + this.nextMonthInterest());
    }

    private double nextMonthInterest() {
        return this.interestRate * this.balance;
    }

    public static void main(String[] args) {
        // to prove that private can only be accessed inside their own class
        CheckingAccount myAccount = new CheckingAccount("Loki", 200);

        System.out.println(myAccount.name);
        System.out.println(myAccount.balance);
        myAccount.addFunds(50);
        myAccount.getInfo();

    }
}
