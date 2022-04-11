import java.util.Scanner;

public class Task13 {
    public static boolean isPolindrome(String t){
        int size = t.length();
        for(int i = 0, j = size - 1; i < j; i++, j--){
            if(t.charAt(i) != t.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isPolindrome(s));
    }
}
