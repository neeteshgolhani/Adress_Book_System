package com.bridgelabz.ifelse;

import java.util.Scanner;

public class ReadsinledigitnumandwriteinWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single-digit number: ");
        int num = sc.nextInt();

        String word;
        if (num == 0) {
            word = "zero";
        } else if (num == 1) {
            word = "one";
        } else if (num == 2) {
            word = "two";
        } else if (num == 3) {
            word = "three";
        } else if (num == 4) {
            word = "four";
        } else if (num == 5) {
            word = "five";
        } else if (num == 6) {
            word = "six";
        } else if (num == 7) {
            word = "seven";
        } else if (num == 8) {
            word = "eight";
        } else if (num == 9) {
            word = "nine";
        } else {
            word = "Invalid input";
        }

        System.out.println("The number in words is: " + word);
    }
}
