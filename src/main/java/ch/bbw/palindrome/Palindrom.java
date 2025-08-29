package ch.bbw.palindrome;

public class Palindrom {
    public static boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversedInput);
    }
}
