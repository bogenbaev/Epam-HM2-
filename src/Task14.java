import java.util.HashMap;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        int size = s.length();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < i; j++) {
                String newString = "";
                for (int k = 0; k <= j; k++) {
                    newString += s.charAt(k);
                }
                newString += '1';
                for (int k = i + 1; k < size; k++) {
                    newString += s.charAt(k);
                }
                if (map.containsKey(newString)) {
                    continue;
                }
                System.out.println(newString + " ");
                map.put(newString, 1);
            }
        }
    }
}
