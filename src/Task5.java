import java.util.HashMap;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        String withoutCopy = "";
        int size = s.length();
        for(int i = 0; i < size; i++){
            if(map.containsKey(s.charAt(i))){
                int count = map.get(s.charAt(i));
                count++;
                map.replace(s.charAt(i), count);
                continue;
            }
            map.put(s.charAt(i), 1);
        }
        for(Character it : map.keySet()){
            System.out.println("occurance of the " + it + " is " + map.get(it));
        }
    }
}
