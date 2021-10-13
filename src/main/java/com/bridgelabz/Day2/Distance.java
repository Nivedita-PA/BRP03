package com.bridgelabz.Day2;
import java.util.Scanner;

public class Distance {
    public static double euclidean_distance(int x, int y){
      double val = x*x + y*y;
      double distance = Math.pow(val,1/2);
        System.out.println("Euclidean distance from " + x + "," + y + " is " + distance);
        return distance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x and y axis");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + "," + y);
        euclidean_distance(x,y);
    }
}
