package com.bridgelabz.Day2;

import java.util.Scanner;

public class IntOpt {

    public static void integer_Operations(int a, int b, int c){
        System.out.println("Getting following values for each equation: ");
        int val1 = a + b * c;
        int val2 = a * b + c;
        int val3 = c + a / b;
        int val4 = a % b + c;
        System.out.println(val1 + " " + val2 + " " + val3 + " " + val4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three values: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        integer_Operations(a, b, c);

    }
}
