//Random Password Genertaor

/*Build a program that generates a random password for the user. Prompt the user to enter the desired length of the password and specify whether it should include numbers, lowercase letters, uppercase letters, and special
characters. Generate the password accordingly and display it to the user. */
import java.util.*;
import java.util.Random;

public class RandomPasswordGenerator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Desired Password length: ");
        int length = sc.nextInt();

        System.out.println("Include Numbers? (true/false): ");
        boolean includeNumbers = sc.nextBoolean();

        System.out.println("Include Lowercase Letters? (true/false): ");
        boolean includeLowercase = sc.nextBoolean();

        System.out.println("Include Uppercase Letters? (true/false): ");
        boolean includeUppercase = sc.nextBoolean();

        System.out.println("Include Special Characters? (true/false): ");
        boolean includeSpecialChars = sc.nextBoolean();

        // Generate and display the password 
        String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecialChars);
        System.out.println("Generated Password: "+password);
        
        sc.close();

    }

    public static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, boolean includeSpecialChars){
        String numbers = "0123456789"; 
        String lowercase = "abcdefghijklmnopqrstuvwxyz"; 
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?/";

        String charSet = ""; 
        if (includeNumbers) { 
            charSet += numbers; 
        } 
        if (includeLowercase) {
            charSet += lowercase; 
        } 
        if (includeUppercase) {
            charSet += uppercase; 
        } 
        if (includeSpecialChars) {
             charSet += specialChars;
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i < length; i++){
            int index = random.nextInt(charSet.length());
            password.append(charSet.charAt(index));
        }

        return password.toString();
    }
}