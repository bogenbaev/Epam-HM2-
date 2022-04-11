import java.io.InputStream;
import java.util.Scanner;

public class Task6 {
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
        int size = s.length();
        s = reverse(s);
        System.out.println(s);

    }
}
