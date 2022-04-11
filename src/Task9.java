import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        Arrays.sort(words);
        int size = words.length;
        for(int i = 0; i < size; i++){
            System.out.print(words[i] + " ");
        }
    }
}
