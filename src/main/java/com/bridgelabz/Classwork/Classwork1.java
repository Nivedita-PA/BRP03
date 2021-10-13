package com.bridgelabz.Classwork;

import java.util.Scanner;

public class Classwork1 {

//      static void printBinary(int[] binary, int id)
//      {
//       System.out.println("Binary value: ");
//        for (int i = id - 1; i >= 0; i--) {
//          System.out.print(binary[i]);
//      }
//      }
    public static void decimalToBinary(int num) {
        int[] binary = new int[35];
        int i = 0;
        while (num > 0) {
            binary[i++] = num % 2;
            num = num / 2;
        }
        //printBinary(binary, i);
        System.out.println("Binary value: ");
        for (int a = i - 1; a >= 0; a--) {
            System.out.print(binary[a]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        decimalToBinary(num);
    }
}
