import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String newString = "";
        int size = s.length();
        for(int i = 0; i < size; i++){
            if(i % 2 == 1 && s.charAt(i) != ' '){
                newString += " ";
            }
            newString += s.charAt(i);
        }
        System.out.println(newString);
    }
}
