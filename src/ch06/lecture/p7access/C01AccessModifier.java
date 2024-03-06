package ch06.lecture.p7access;
// access modifier (접근 제한자, 접근 제어자)
// 멤버 (필드, 메소드)
// 생성자, 클래스

// public : 모든 곳에서 접근 가능 (가장 넓은 범위)
// protected : package private + 다른 패키지여도 상속받으면 접근 가능
// (package private) : 같은 패키지 내에서 접근 가능
// private : 클래스 내에서만 접근 가능 (가장 좁은 범위)
public class C01AccessModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 30; // public
        o1.name = "son"; // package private
//        o1.address = "seoul"; // private

    }
}

// 하나의 파일에
// 하나의 public class만 작성 가능