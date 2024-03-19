package ch13.lecture.p1generic;

public class C08WildCard {
    public static void main(String[] args) {

    }

    // 상한 와일드카드
    public static void method(C07Box<? extends Object> box) {
        Object o = box.getItem();
    }

    public static void method2(C07Box<?> box) { // Object라서 생각하고 ? 만 작성
        Object o = box.getItem();
    }
}

