import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String forNumber = "";
        int size = s.length();
        for(int i = 0; i < size; i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                forNumber += s.charAt(i);
            }
        }
        System.out.println(forNumber);
    }
}
