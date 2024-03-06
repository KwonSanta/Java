package ch06.exercise.p20;

public class Account {
    /*
    account {
                {계좌번호, 계좌주, 입금, 출금, 잔액},
                {계좌번호, 계좌주, 입금, 출금, 잔액},
                {계좌번호, 계좌주, 입금, 출금, 잔액},
            }
    */
    // field
    private String acntNum;
    private String acntName;
    private int balance;

    // getter & setter
    public String getAcntNum() {
        return acntNum;
    }

    public void setAcntNum(String acntNum) {
        this.acntNum = acntNum;
    }

    public String getAcntName() {
        return acntName;
    }

    public void setAcntName(String acntName) {
        this.acntName = acntName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // method
    // 입금
    public void depositMoney(int money) {
        this.balance += money;
        System.out.println(STR."잔고액 : \{this.balance}");
    }

    // 출금
    public void withdrawlMoney(int money) {
        if (balance < money) {
            System.out.print("잔액보다 출금액이 큽니다.");
            System.out.println("잔액을 확인해주세요");
            System.out.println(STR."잔고액 : \{this.balance}");
        } else {
            this.balance -= money;
            System.out.println(STR."잔고액 : \{this.balance}");
        }
    }

}
