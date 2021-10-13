package com.bridgelabz.Day2;

import java.util.Scanner;

public class SumofTwoDice {

    public static void die_sum(){
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, enter;
        System.out.println("Roll the dice for 1st value entering 1: ");
        enter = scanner.nextInt();
        if(enter == 1) {
             a = 1 + (int) (Math.random() * 6);;
            System.out.println(a);
        }
        System.out.println("Roll the dice for 2nd value entering 2: ");
        enter = scanner.nextInt();
        if(enter == 2) {
             b = 1 + (int) (Math.random() * 6);;
            System.out.println(b);
        }
        int sum = a + b;
        System.out.println("Sum of two die values: " + sum);
    }

    public static void main(String[] args) {
        die_sum();
    }
}
