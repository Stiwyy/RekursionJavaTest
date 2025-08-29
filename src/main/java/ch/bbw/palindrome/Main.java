package ch.bbw.palindrome;

import java.util.Scanner;

import static ch.bbw.palindrome.Palindrom.isPalindrome;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text.");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }

        scanner.close();

   }

}