package com.bridgelabz.Classwork;

import java.util.Scanner;

public class SelfDividing {
    public static boolean self_Dividing(int num){
        boolean self_divisible = false;
        String flag = null;
        int[] num1 = new int[String.valueOf(num).length()];
        for (int i=0; i<num1.length; i++){
            if(num1[i] % num == 0 && !(num1[i] == 0)){
                flag = "self-divisible";
                self_divisible = true;
                break;
            }
            else {
                flag = "not self-divisible";
                self_divisible = false;
            }
        }
        System.out.println(flag + " " + self_divisible);
        return self_divisible;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println(num);
        self_Dividing(num);
    }
}
