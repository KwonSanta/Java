import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // nums1, nums2 를 비교하여 중복되는 값을 뺸 배열을 answer[0], answer[1]로 출력
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        // 합친 set에서 remove num2원소 = answer[0]
        //                   num1원소 = answer[1]

        // 합친 Set 생성
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            set.add(num);
        }
        System.out.println(set);

        for (int num : set) {
            set.contains(num);
        }

    }
}
