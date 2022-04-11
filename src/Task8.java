import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static String reverse(String t){
        String newString = "";
        int size = t.length();
        for(int i = size - 1; i >= 0; i--){
            newString += t.charAt(i);
        }
        return newString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        s = "";
        int size = words.length;
        for(int i = 0; i < size; i++) {
            words[i] = reverse(words[i]);
            s += words[i] + " ";
        }
        System.out.println(s);
    }
}
