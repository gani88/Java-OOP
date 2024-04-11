package static_var_method;

public class Atm {

    public static int totalMoney = 0;
    public static int numATMs = 0;
    public int money;

    public Atm(int inputMoney) {
        this.money = inputMoney;

        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw) {
        if (amountToWithdraw <= this.money) {
            this.money -= amountToWithdraw;

            totalMoney -= amountToWithdraw;
        }
    }

    public static void averageMoney() {
        System.out.println("Total Average Money in ATMs is " + totalMoney/numATMs);
    }

    public static void main(String[] args) {

        System.out.println("Total ATMs : " + Atm.numATMs);
        Atm firstATM = new Atm(1000);
        Atm secondATM = new Atm(500);
        System.out.println("Total ATMs : " + Atm.numATMs);

        Atm.averageMoney();
        System.out.println("Total Money in ATM :  " + Atm.totalMoney);
        firstATM.withdrawMoney(300);
        secondATM.withdrawMoney(100);
        System.out.println("Total Money in ATM :  " + Atm.totalMoney);
        Atm.averageMoney();
    }
}
