package ch06.exercise.p20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account[] accounts = new Account[100];

        int menu = 0; // 선택>
        int i = 0; // 객체배열의 index
        boolean isStop = false;
        while (!isStop) {
            System.out.println("-------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-------------------------------------------");
            System.out.print("선택>");
            menu = Integer.parseInt(sc.nextLine()); // 선택 번호
            switch (menu) {
                case 1 -> {
                    Account acnt = new Account();
                    accounts[i] = acnt;
                    System.out.println("--------");
                    System.out.println(" 계좌생성 ");
                    System.out.println("--------");
                    System.out.print("계좌번호: ");
                    accounts[i].setAcntNum(sc.nextLine());
                    System.out.print("계좌주: ");
                    accounts[i].setAcntName(sc.nextLine());
                    System.out.print("초기입금액: ");
                    accounts[i].depositMoney(Integer.parseInt(sc.nextLine()));
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    i++;
                }
                case 2 -> {
                    System.out.println("--------");
                    System.out.println(" 계좌목록 ");
                    System.out.println("--------");
                    for (int j = 0; j < accounts.length; j++) {
                        if (accounts[j] != null) {
                            System.out.println("계좌주: " + accounts[j].getAcntName() + ", 계좌번호: " + accounts[j].getAcntNum() + ", 잔액: " + accounts[j].getBalance());
                        }
                    }
                }
                case 3 -> {
                    System.out.println("--------");
                    System.out.println(" 예금 ");
                    System.out.println("--------");
                    System.out.print("계좌번호: ");
                    String numbers = sc.nextLine();
                    for (int j = 0; j < accounts.length; j++) {
                        if (accounts[j].getAcntNum().contentEquals(numbers)) {
                            System.out.print("예금액: ");
                            accounts[j].depositMoney(Integer.parseInt(sc.nextLine()));
                            break;
                        }
                    }
                }
                case 4 -> {
                    System.out.println("--------");
                    System.out.println(" 출금 ");
                    System.out.println("--------");
                    System.out.print("계좌번호: ");
                    String numbers = sc.nextLine();
                    for (int j = 0; j < accounts.length; j++) {
                        if (accounts[j].getAcntNum().contentEquals(numbers)) {
                            System.out.print("출금액: ");
                            accounts[j].withdrawlMoney(Integer.parseInt(sc.nextLine()));
                            break;
                        }
                    }
                }
                case 5 -> {
                    System.out.println("프로그램 종료");
                    isStop = true;
                }
            }
        }
    }
}
