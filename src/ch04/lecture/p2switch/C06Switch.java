package ch04.lecture.p2switch;

public class C06Switch {
    public static void main(String[] args) {
        String city = "서울";

        switch (city) {
            // 서울, 인천
            case "서울", "인천" -> System.out.println("수도권입니다.");

            // 광주, 전주
            case "광주", "전주" -> System.out.println("호남권입니다.");

            // 대구, 부산
            case "대구", "부산" -> System.out.println("영남권입니다..");

            default -> System.out.println("다른 도시입니다.");
        }
    }
}
