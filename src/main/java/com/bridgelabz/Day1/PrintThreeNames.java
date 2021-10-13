package com.bridgelabz.Day1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PrintThreeNames {

   public static void print_Names(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the array length: ");
       int array_Length = scanner.nextInt();
       String[] array_Names = new String[array_Length];
       System.out.println("Enter the names in the array");
       for(int i=0; i<array_Length; i++) {
           array_Names[i] = scanner.nextLine();
           System.out.println(array_Names[i]);
       }
       System.out.println(Arrays.toString(array_Names));

       Arrays.sort(array_Names, Collections.reverseOrder());
       System.out.println(Arrays.toString(array_Names));


    }

    public static void main(String[] args) {
       print_Names();
    }
}
