package ch05.lecture.p3enum;

public class C02Enum {
    public static void main(String[] args) {

        Season s = Season.FALL;

        switch (s) {
            case SPRING -> System.out.println("봄");
            case SUMMER -> System.out.println("여름");
            case FALL -> System.out.println("가을");
            case WINTER -> System.out.println("겨울");
        }

        // java.lang.Enum에서 상속한 메소드
        System.out.println(s.name());
        System.out.println(s.ordinal());

        // Object 상속 -> 메소드 사용 가능
        System.out.println(s.toString());
        System.out.println(s.hashCode());

        // 메소드 사용
        s.printDescription();
    }
}

enum Season {
    SPRING,
    SUMMER,
    FALL,
    WINTER;

    // 필요하면 메소드 작성가능
    public void printDescription() {
        System.out.println(this.name() + "이네요.");
    }
}