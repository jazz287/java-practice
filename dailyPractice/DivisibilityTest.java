import java.util.*;
public class DivisibilityTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");

        int num = sc.nextInt();
        if(num%3==0){
            System.out.print("Fizz");
        }
        if(num%3==0 && num%5==0 ){
            System.out.print("FizzBuzz");
        }
        else if(num%5==0){
            System.out.print("Buzz");
        }
    }
}