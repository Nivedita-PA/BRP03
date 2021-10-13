package com.bridgelabz.Day2;

import java.util.Scanner;

public class DoubleOpt {
    public static void double_Operations(double a, double b, double c){
        System.out.println("Getting following values for each equation: ");
        double val1 = a + b * c;
        double val2 = a * b + c;
        double val3 = c + a / b;
        double val4 = a % b + c;
        System.out.println(val1 + " " + val2 + " " + val3 + " " + val4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three values: ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double_Operations(a, b, c);
    }
}
