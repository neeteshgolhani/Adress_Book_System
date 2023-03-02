package com.bridgelabz.ifelse;

import java.awt.*;
import java.util.Scanner;

public class Readanumanddisplayunit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int unit = number % 10;
        int ten = (number / 10) % 10;
        int hundred = (number / 100) % 10;

        System.out.println("Unit: " + unit);
        System.out.println("Ten: " + ten);
        System.out.println("Hundred: " + hundred);
    }
}
