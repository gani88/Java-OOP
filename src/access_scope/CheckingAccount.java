package access_scope;

public class CheckingAccount {
    public String name;
    private int balance;
    private String id;

    public CheckingAccount(String inputName, int inputBalance) {
        name = inputName;
        balance = inputBalance;
    }

    public CheckingAccount(String inputName, int inputBalance, String inputId) {
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    public void addFunds(int fundsToAdd) {
        balance += fundsToAdd;
        System.out.println("Adding " + fundsToAdd + " to this account");
    }

    public void getInfo() {
        System.out.println("This checking account belongs to " + name + ". It has " + balance + " dollars in it.");
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
