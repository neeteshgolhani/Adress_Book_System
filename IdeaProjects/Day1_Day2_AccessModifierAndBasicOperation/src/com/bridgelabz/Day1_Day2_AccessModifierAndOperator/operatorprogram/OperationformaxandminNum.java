package com.bridgelabz.operatorprogram;

import java.util.Scanner;

public class OperationformaxandminNum {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int c = 5;
        int max = Math.max(a + b * c, Math.max(c + a / b, Math.max(a % b + c, a * b + c)));
        int min = Math.min(a + b * c, Math.min(c + a / b, Math.min(a % b + c, a * b + c)));
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
