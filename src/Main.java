import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange"};

        // Array -> List
        // #1. Arrays.asList(arr) 메소드 사용 (👍🏼)
        List<String> list1 = Arrays.asList(arr);
        // #2. List.of(arr) 메소드 사용
        List<String> list2 = List.of(arr);
        // #3. Stream 이용 (👍🏼)
        List<String> list3 = Arrays.stream(arr).toList();  // jdk 16~
        List<String> list4 = Arrays.stream(arr).collect(Collectors.toList()); // jkd 8~

        // List -> Array
        // #1. list.toArray() 메소드 사용 (👍🏼)
        Object[] arr1 = list1.toArray();
        String[] stringArr1 = Arrays.copyOf(arr1, arr1.length, String[].class); // Object[] -> String[] 형변환 과정 필요
        // #2. Stream 이용 ((👍🏼)
        String[] arr2 = list1.toArray(new String[0]);

    }
}