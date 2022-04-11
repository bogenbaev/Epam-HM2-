import java.util.HashMap;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        int size = s.length();
        for(int i = 0; i < size; i++){
            for(int j = 0; j <= i; j++){
                String subString = "";
                for(int k = j; k <= i; k++){
                    subString += s.charAt(k);
                }
                if(map.containsKey(subString)){
                    continue;
                }
                map.put(subString, 1);
            }
        }
        int answer = map.size();
        System.out.println(answer);
    }
}
