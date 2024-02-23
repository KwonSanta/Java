package ch04.lecture.p2switch;

public class C05Switch {
    public static void main(String[] args) {
        String city = "서울";

        switch (city) {
            // 서울, 인천
            case "서울":
            case "인천":
                System.out.println("수도권입니다.");
                break;
            // 광주, 전주
            case "광주", "전주":
                System.out.println("호남권입니다.");
                break;
            case "대구":
            case "부산":
                System.out.println("영남권입니다..");
        }
    }
}
