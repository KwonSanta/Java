package ch13.exercise.p2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.setContent("홍길동");
        String str = container1.getContent();
        System.out.println(str);

        Container<Integer> container2 = new Container<>();
        container2.setContent(6);
        int value = container2.getContent();
        System.out.println(value);

    }
}
