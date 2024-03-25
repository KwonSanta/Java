package ch11.lecture.p1exception;

import java.util.List;

public class C12Polymorphism {
    public static void main(String[] args) {

        try {
            Class.forName("java.lang.String"); // ClassNotFoundException
            List.of().get(0); // IndexOutOfBoundsException
            Integer.parseInt("hundred"); // NumberFormatException
        } catch (NumberFormatException e) { // catch 블럭의 순서 중요함!!
            System.out.println("코드 1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
