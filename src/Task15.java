import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        String s = "abcde";
        int size = s.length();
        String first = s.substring(0, 2);
        String second = s.substring(size - 1, size);
        System.out.println(first + " " + second);
        System.out.println(first + " position is 0 2 and " + second + " position 4 5 " + "distance between them = 2");
    }
}
