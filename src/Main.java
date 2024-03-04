import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String answer = "";
        String my_string = "Bcad";

        my_string = my_string.toLowerCase();
        char[] chArr = my_string.toCharArray();
        Arrays.sort(chArr);

        for (int i = 0; i < chArr.length; i++) {
            answer += chArr[i];
        }
        System.out.println("answer = " + answer);
    }
}