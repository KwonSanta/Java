package ch07.lecture.p2polymolphism;

public class C02Polymolphism {
    public static void main(String[] args) {
        C02Cat cat = new C02Cat();
        cat.breathe();

        // 🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥
        C02Animal animal = cat;
        animal.breathe();   // 인스턴스 메소드가 실행됨

        C02Animal animal1 = new C02Animal();
        C02Animal animal2 = new C02Cat();

        animal1.breathe(); // 호흡합니다.
        animal2.breathe(); // 폐로 호흡합니다.
    }
}

class C02Animal {
    public void breathe() {
        System.out.println("호흡합니다.");
    }
}

class C02Cat extends C02Animal {
    @Override
    public void breathe() {
        System.out.println("폐로 호흡합니다.");
    }
}