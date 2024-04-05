package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) throws ClassNotFoundException {

        // 방법1
        Class clazz1 = Car.class;

        // 방법2
        Class clazz2 = Class.forName("ch12.sec11.exam01.Car");

        // 방법3
        Car car = new Car();
        Class clazz3 = car.getClass();

        System.out.println("패키지: " + clazz3.getPackage().getName());
        System.out.println("클래스 간단 이름: " + clazz3.getSimpleName());
        System.out.println("클래스 전체 이름: " + clazz3.getName());

    }
}
