import java.util.*;
public class findVowels{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a string");

String str = sc.nextLine();
for(int i = 0 ; i <str.length() ; i++ ){
    char ch = str.charAt(i);

switch(ch){
    case 'a' : 
    System.out.println("yess!! vowel exists");
    break;
    case 'e' :
    System.out.println("yess!! vowel exists");
    break;
    case 'i' :
    System.out.println("yess! vowel exists");
    break;
    case 'o' :
    System.out.println("yess! vowel exists");
    break;
    case 'u' :
    System.out.println("yess! vowel exists");
    break;
    default: 
    System.out.println("Sorry ! No vowel exists");
    break;
    
}
}
}










