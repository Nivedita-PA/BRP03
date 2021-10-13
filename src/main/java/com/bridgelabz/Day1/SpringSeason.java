package com.bridgelabz.Day1;

import java.util.Scanner;

public class SpringSeason {

    public static boolean months_Spring(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day:");
        int day = scanner.nextInt();
        if(day <= 31){
            System.out.println(day);
        }
        boolean valid;
        System.out.println("Enter the month");
        int month = scanner.nextInt();
        if(month == 3 || month == 4 || month == 5 || month == 6){
            valid = true;
            System.out.println("Date/month: " + day + "/" + month + " " + valid);
        }
        else{
            valid = false;
            System.out.println("Date/month: " + day + "/" + month + " " + valid);
        }
            return valid;
    }

    public static void main(String[] args) {
        months_Spring();
    }
}
