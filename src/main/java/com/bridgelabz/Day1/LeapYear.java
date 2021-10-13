package com.bridgelabz.Day1;

import java.util.Scanner;

public class LeapYear {

    public static void leap_year(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        if(year >= 1582 && year <= Math.random()*10000) {
            System.out.println("Valid range");
        }
        else{
            System.out.println("Enter the year again");
            year = scanner.nextInt();
        }
        if(year % 4 == 0){
            System.out.println(year + " Leap year");
        }
        else{
            System.out.println(year + " Not a Leap Year");
        }
    }

    public static void main(String[] args) {
        leap_year();
    }
}
