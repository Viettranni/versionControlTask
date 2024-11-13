package task4_1;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // This is viet's comment
        Scanner scan = new Scanner(System.in);  // Changed variable 'scanner' to 'scan'
        System.out.println("Testing if the input is Palidrome, please give me something: ");
        String inputText = scan.nextLine();  // Changed variable 'input' to 'inputText'
        
        String modifiedText = modifyInput(inputText);  // Changed variable 'modified' to 'modifiedText'
    
        boolean isPalindrome = checkPalindrome(modifiedText);
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }

        scan.close();  // Changed variable 'scanner' to 'scan'
    }

    public static String modifyInput(String inputText) {  
        // Taking out the dot and !
        inputText = inputText.toLowerCase();  
        inputText = inputText.replace(",", "");
        inputText = inputText.replace("!", "");
        return inputText;
    }

    public static boolean checkPalindrome(String inputText) {  
        // Returns true if the reversed string equals the input
        String reversed = reverseString(inputText);  
        if (inputText.equals(reversed)) { 
            return true;
        } else {
            return false;
        }
    }

    public static String reverseString(String inputText) { 
        StringBuilder reversed = new StringBuilder();
        for (int i = inputText.length() - 1; i >= 0; i--) {  
            reversed.append(inputText.charAt(i));  
        }
        return reversed.toString();
    }
}
