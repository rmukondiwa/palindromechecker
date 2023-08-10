import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String reversedWord = "";
        String lowercase = s.toLowerCase();

        for (int i = lowercase.length() - 1; i >= 0; i--) {
            reversedWord += lowercase.substring(i, i + 1);
        }

        return reversedWord.equals(lowercase);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text");
        String userInput = scan.nextLine();

        boolean result = isPalindrome(userInput);
        if (result) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
}

