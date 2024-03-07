package ch07.lecture.p2polymolphism;

public class C03Polymolphism {
    public static void main(String[] args) {
        C03Fish fish = new C03Fish();
        fish.breathe();
        fish.swim();

        C03Cat cat = new C03Cat();
        cat.breathe();
        cat.walk();

        C03Animal animal = fish;
        animal.breathe(); // 아가미 호흡
//        animal.swim(); // X -> 실제로 참조변수가 갖고 있는 기능만 실행

        animal = cat;
        animal.breathe(); // 폐 호흡
    }
}

class C03Animal {
    public void breathe() {
        System.out.println("호흡하다");
    }
}

class C03Fish extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("아가미 호흡");
    }

    public void swim() {
        System.out.println("헤엄치다");
    }
}

class C03Cat extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("폐로 호흡하다");
    }

    public void walk() {
        System.out.println("걷다");
    }
}