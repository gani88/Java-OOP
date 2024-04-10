package access_scope;

public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank() {
        accountOne = new CheckingAccount("Zeus", 100, "1");
        accountTwo = new CheckingAccount("Hades", 50, "2");
    }

    public static void main(String[] args) {
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.name);
        bankOfGods.accountOne.addFunds(50);
        bankOfGods.accountOne.getInfo();
    }
}
