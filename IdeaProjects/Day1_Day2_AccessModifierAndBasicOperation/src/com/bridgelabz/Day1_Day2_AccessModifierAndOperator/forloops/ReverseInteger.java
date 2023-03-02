package com.bridgelabz.forloops;
import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int reversedNumber = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
}
