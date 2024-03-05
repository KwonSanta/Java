package ch06.exercise.p15;

public class MemberService {
    String id = "hong";
    String password = "12345";

    boolean login(String id, String password) {
        if (id.equals(this.id) && password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
