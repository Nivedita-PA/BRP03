package com.bridgelabz.Day3;

import java.util.Scanner;

public class WindChill {

    public static void effective_Temp(double t, double v) {
        System.out.println("Effective temperature in Fahrenheit: ");
        double temp = 35.74 * t + 0.6215 * t + (0.4275 * t - 37.5) * Math.pow(v, 0.16);
        System.out.println(temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of t and v for calculating temperature in Fahrenheit");
        double t = scanner.nextDouble();
        double v = scanner.nextDouble();
        while((v > 120.00) || (v < 3) || (t >= 51.00)) {
            System.out.println("Renter the values: ");
            t = scanner.nextDouble();
            System.out.println(t);
            v = scanner.nextDouble();
            System.out.println(v);
        }
        effective_Temp(t,v);
        for(int i = 0; i < args.length; i++) {
            System.out.println("Argument is: "+args[i]);
        }
    }
}