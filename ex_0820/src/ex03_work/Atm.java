package ex03_work;

public class Atm {

    private int money;// 잔액

    // 입금
    public void deposit(int money) {
        System.out.println("입금 성공");
        this.money += money;
    }

    public void withdraw(int money) {

        if (this.money - money < 0) {
            System.out.println("잔액부족");

        } else {
            System.out.println("출금성공");
            this.money -= money;
        }

    }

    public void balance() {
        System.out.println("잔액 : " + money);

    }

    // account = account + money;
    // }
    // public boolean withdraw(int money) {

    // if (money <= account) {
    // account= account - money;
    // return true;

    // }
    // return false;
    // }

    // public int getBalance() {
    // return account;

}
