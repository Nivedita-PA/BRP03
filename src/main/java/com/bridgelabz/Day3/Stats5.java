package com.bridgelabz.Day3;

import java.util.Scanner;

public class Stats5 {

    public static void die_five() {
        Scanner scanner = new Scanner(System.in);
        String  enter = null;
        System.out.println("Enter start for die to roll five values between 0 and 1 and start the operations:");
        enter = scanner.nextLine();
        if (enter.equals("start")) {
            float a = 0 + (float) (Math.random() * 1);
            float b = 0 + (float) (Math.random() * 1);
            float c = 0 + (float) (Math.random() * 1);
            float d = 0 + (float) (Math.random() * 1);
            float e = 0 + (float) (Math.random() * 1);
            System.out.println(a + " " + b + " " + c + " " + d + " " + e);
            System.out.println("Average of all these values: ");
            float avg = a + b + c + d + e / 5;
            System.out.println(avg);
            float min = Math.min(Math.min(a,b), Math.min(Math.min(c,d),e));
            System.out.println("Minimum value of the random values generated: " + min);
            float max = Math.max(Math.max(a,b), Math.max(Math.max(c,d),e));
            System.out.println("Maximum value of the random values generated: " + max);

        }
    }

    public static void main(String[] args) {
        die_five();
    }

}
