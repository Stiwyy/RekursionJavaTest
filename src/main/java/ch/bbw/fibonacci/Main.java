package ch.bbw.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int number = input.nextInt();
        input.close();

        System.out.println("Die ersten " + number + " Fibonacci-Zahlen:");
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacci(number);
    }
}
