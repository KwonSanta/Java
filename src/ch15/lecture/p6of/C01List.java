package ch15.lecture.p6of;

import java.util.ArrayList;
import java.util.List;

public class C01List {
    public static void main(String[] args) {
        // 수정 O
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");
        list.add("react");
        System.out.println(list);
        list.add("spring");
        list.remove(0);
        list.set(1, "vue");
        System.out.println(list);


        // of : 수정 X
        List<String> list2 = List.of("java", "css", "html", "react");
        System.out.println(list2);

    }
}
