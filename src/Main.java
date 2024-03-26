public class Main {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " 실행");
    }
}