package com.bridgelabz.Day3;

import java.util.Scanner;

public class CarLoan {

    public static void monthly_Pay(double p, double r, double t){
        double n = 12 * t;
        double R = r/12*100;
        double pay = p * R /1 - Math.pow(1+R,-n);
        System.out.println("Monthly pay: " + pay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for principle amount, total time, and interest: ");
        double p = scanner.nextDouble();
        double r = scanner.nextDouble();
        double t = scanner.nextDouble();
        System.out.println(p + " " + r + " " + t);
        monthly_Pay(p, r, t);
    }
}
