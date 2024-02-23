package ch04.lecture.p2switch;

public class C02Switch {
    public static void main(String[] args) {
        // break 문 생략시 코드 실행은 계속 진행됨
        System.out.println("statement 1");

        String city = "seoul";

        switch (city) {
            case "seoul" -> {
                System.out.println("statement 2");
            }
            case "busan" -> {
                System.out.println("statement 3");
                break;
            }
            case "jeju" -> {
                System.out.println("statement 4");
                break;
            }
        }
        System.out.println("statement 5");
    }
}
