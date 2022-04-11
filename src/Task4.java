import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        String withoutCopy = "";
        int size = s.length();
        for(int i = 0; i < size; i++){
            if(map.containsKey(s.charAt(i))){
                continue;
            }
            withoutCopy += s.charAt(i);
            map.put(s.charAt(i), 1);
        }
        System.out.println(withoutCopy);
    }
}
