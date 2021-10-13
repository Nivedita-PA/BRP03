package com.bridgelabz.Classwork;

import java.util.Scanner;

public class PrimeNumber {

    public static void prime_Num(int num) {
        int flag = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 2;
                break;
            } else {
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.println("prime");
        }else
        {
            System.out.println("not prime");
        }
    }

    public static final void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        prime_Num(num);
    }
}
