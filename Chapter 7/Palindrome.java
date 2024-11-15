import java.util.Scanner;

public class Palindrome{
      public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a string: ");
         String word = scan.nextLine();
         String output = isPalindrome(word) ? "This is a palindrome." : "This is not a palindrome.";
         System.out.println(output);    
      }
      
      public static boolean isPalindrome(String word){
         int length = word.length();
         String reversed = "";
         
         for(int i = (length - 1); i >= 0; --i){
            reversed = reversed + word.charAt(i);
         }
         
         return reversed.toLowerCase().equals(word.toLowerCase()) ? true : false;
      }
}