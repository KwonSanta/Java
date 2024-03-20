package ch15.lecture.p3stack;

import java.util.Stack;

public class C01Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("java");
        stack.push("react");
        stack.push("spring");
        stack.push("css");

        System.out.println(stack.size()); // 4

        String s1 = stack.pop(); // css
        String s2 = stack.pop(); // spring
        String s3 = stack.pop(); // react
        String s4 = stack.pop(); // java

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(stack.size()); // 0

    }
}
