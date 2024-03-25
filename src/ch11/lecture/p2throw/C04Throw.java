package ch11.lecture.p2throw;

public class C04Throw {

    public static void main(String[] args) {
        try {
            method1();
        } catch (ReflectiveOperationException e) { // 아래의 메소드에서 throws 한 클래스와 같거나 상위 타입의 Exception 이여야함
            e.printStackTrace();                   // -> ReflectiveOperationException 과 같거나 상위타입인 Exception 이 와야함
        }
    }

    public static void method1() throws ReflectiveOperationException { // ReflectiveOperationException 으로 던짐
        throw new ClassNotFoundException();
    }
}
