package ch13.lecture.p1generic;

public class C02GenericType {
    public static void main(String[] args) {
        C02Box<String> box1 = new C02Box<String>();
        C02Box<Integer> box2 = new C02Box<Integer>();

        box1.setItem("java");
        String item1 = box1.getItem();

        box2.setItem(300);
        Integer item2 = box2.getItem();
    }
}

// generic type
// < > : 타입 파라미터
// 타입 파라미터명 작성관습
//  : 대문자 한글자
// 주로 사용하는 이름들
// T : Type
// E : Element; 원소; 요소;
// K : Key
// V : Value
// R : Return, Result
// S, U, V
// T1, T2
class C02Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}