//Palindrome Checker

/*Implement a program that checks whether a given word or phrase is a palindrome. A palindrome is a word or phrase that reads the same forwards and backward, ignoring spaces and punctuation. */
import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or phrase:");
        String input = sc.nextLine();
        
        // Remove spaces and punctuation, and convert to lowercase
        String sanitizedInput = input.replaceAll("[\\W_]", "").toLowerCase();
        
        // Check if the sanitized string is a palindrome
        if (isPalindrome(sanitizedInput)) {
            System.out.println("The entered word/phrase is a palindrome.");
        } else {
            System.out.println("The entered word/phrase is not a palindrome.");
        }
        
        sc.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
