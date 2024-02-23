package ch04.lecture.p2switch;

public class C09Yield {
    public static void main(String[] args) {
        String city = "seoul"; // paris, london, tokyo

        String area = switch (city) {
            case "seoul", "tokyo" -> "asia";
            case "paris", "london" -> {
                System.out.println("statement..1");
                System.out.println("statement..2");
                yield "europe"; // 마지막에 존재
//                System.out.println("실행되지 않음"); // 실행 되지 않음
            }
            default -> "etc..";
        };

        int length = 5;
        String shape = "원"; //원, 정사각형, 삼각형

        double result = switch (shape) {
            case "원" -> {
                double calc = 3.14 * length * length;
                yield calc;
            }
            case "정사각형" -> length * length;
            default -> 0.0;
        };
    }
}
