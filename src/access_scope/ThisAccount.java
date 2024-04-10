package access_scope;

public class ThisAccount {
    public String owner;
    public int balanceDollar;
    public double balanceEuro;

    public ThisAccount(String inputOwner, int inputDollar) {
        this.owner = inputOwner;
        this.balanceDollar = inputDollar;
        this.balanceEuro = balanceEuro;
    }

    public void addMoney(int dollarToAdd) {
        System.out.println("Your Account " + this.owner + " Before Add is " + this.balanceDollar);
        this.balanceDollar += balanceDollar;
        System.out.println("Your Account " + this.owner + " After Add is " + this.balanceDollar);
    }

    public static void main(String[] args) {
        ThisAccount myAccount = new ThisAccount("Atros", 5000);
        myAccount.addMoney(5000);
    }
}
