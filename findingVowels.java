import java.util.*;
public class findingVowels {
public static void main(String args[]){

Scanner sc =  new Scanner(System.in);
System.out.println("Enter string here");

String str = sc.nextLine();

for(int i = 0 ; i< str.length() ; i++){
    char ch = str.charAt(i);
    if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
        System.out.println("yes!! vowel exists");
        break;
    }
       
    }
    if(ch ==! 'a' || ch ==! 'e' || ch==! 'i' || ch==! 'o' || ch==! 'u'){
        System.out.println("No vowels!!");
    }
}







}



