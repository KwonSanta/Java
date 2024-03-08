package ch07.lecture.p3casting;

public class C03Casting {
    public static void main(String[] args) {
        C03Tiger tiger = new C03Tiger();
        C03Animal animal = tiger;

    }
}

class C03Animal {
    public void breathe() {
        System.out.println("숨쉬다");
    }
}

class C03Tiger extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("호랑이가 숨쉬다.");
    }
}

class C03Cat extends C03Animal {
}