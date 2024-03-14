package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        System.out.println("obj = " + obj.intValue());
        System.out.println(obj);
        System.out.println(obj.hashCode());
        System.out.println(System.identityHashCode(obj));

        // Unboxing
        int value = obj;
        System.out.println("value = " + value);

        // 연산 시 Unboxing
        int result = obj + 100;
        System.out.println("result = " + result);

    }
}
