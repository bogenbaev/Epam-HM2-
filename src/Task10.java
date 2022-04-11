import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int minSize = 99999999;
        int size = words.length;
        for(int i = 0; i < size; i++){
            if(words[i].length() < minSize){
                minSize = words[i].length();
            }
        }
        System.out.println(minSize);
    }
}
