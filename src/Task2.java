import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        int size = s.length();
        for(int i = 0; i < size; i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                count++;
            }
        }
        System.out.println(count);
    }
}
