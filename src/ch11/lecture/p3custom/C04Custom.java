package ch11.lecture.p3custom;

public class C04Custom {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        try {
            throw new LackOfCaffeineException("카페인 부족");
        } catch (LackOfCaffeineException e) {
            e.printStackTrace();
        }
    }
}

// 직접 만드는 exception
// 1. Exception : checkedException
class LackOfCaffeineException extends Exception {
    LackOfCaffeineException() {
    }

    LackOfCaffeineException(String message) {
        super(message);
    }
}