package com.bridgelabz.whilwloop;

import java.util.Scanner;

public class Sumofnnaturalnum {
    public static void main(String[] args) {
        int num, i = 1, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        num = input.nextInt();
        input.close();

        while (i <= num) {
            sum += i;
            i++;
        }

        System.out.println("The sum of first " + num + " natural numbers is: " + sum);
    }
}
