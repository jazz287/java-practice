import java.util.*;

public class Input {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                System.out.print(Character.toString(ch).toUpperCase());
            } else {
                System.out.print(ch);
            }
        }
    }
}
