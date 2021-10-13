package com.bridgelabz.Day3;

import java.util.Scanner;

public class DayofWeek {

    public static void week_Day(int month, int day, int year){
       int y0 = year - (14 - month) / 12;
       int x = y0 + y0 /4 - y0 /100 + y0 /400;
       int m0 = month + 12 * ((14 - month) / 12) - 2;
       int d0 = (day + x + 31*m0 / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month, day, and then the year: ");
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.println(month + " " + day + " " + year);
        week_Day(month, day, year);
    }
}
