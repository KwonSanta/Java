import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rowIndex = sc.nextInt();
        List<Integer> numList = new LinkedList<>();
        List<Integer> resultList = new LinkedList<>();

        if (rowIndex == 0) {
            resultList.add(1);
        } else if (rowIndex == 1) {
            resultList.add(1);
            resultList.add(1);
        } else { // rowIndex > 1 : 2, 3, 4, ..., 33
            numList.add(1);
            numList.add(1);
            for (int i = 1; i < rowIndex; i++) {
//                List<Integer> resultList = new LinkedList<>();
//
//                resultList1.add(numList.get(i - 1) + numList.get(i));
//                // numList(0) + numList(1), numList(1) + numList(2)
//                resultList.addFirst(0);
//                resultList.addLast(0);
//                numList = resultList;

            }
        }
    }
}