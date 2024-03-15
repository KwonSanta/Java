package ch13.lecture.p1generic;

public class C04Polymorphism {
    public static void main(String[] args) {

    }
}

class C04Box<T> {
    private T item;

    public void someMethod() {
        // Object 메소드 사용 가능
        System.out.println(item.hashCode());
        System.out.println(item.toString());
        System.out.println(item.equals(null));
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}