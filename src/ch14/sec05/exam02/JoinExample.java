package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        SumThread sumThread = new SumThread();
        sumThread.start();
        sumThread.join();
        System.out.println("1~100 합: " + sumThread.getSum());
    }
}
