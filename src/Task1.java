import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String odd = "";
        String even = "";
        int size = s.length();
        for(int i = 0; i < size; i++){
            int number = s.charAt(i) - '0';
            if(number % 2 == 0){
                even += (char)(number + '0');
            }
            else{
                odd += (char)(number + '0');
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
