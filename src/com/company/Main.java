package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Binary Search Excluding Recursion");
        System.out.println("How many elements do you need?");
        int numElements = scan.nextInt();
        int[] myElements = new int[numElements];

        System.out.println("Please populate the array. Press return after each value.");
        for (int i = 0; i < myElements.length; i++) {
            myElements[i] = scan.nextInt();
        }

        System.out.print("Here is your array: ");
        for (int i = 0; i < myElements.length; i++) {
            System.out.print(myElements[i] + " ");
        }

        boolean retry = true;
        while(retry) {
            System.out.println("\nWhat number would you like to search for in your array?");
            int number = scan.nextInt();

            int index = BinarySearchExRecursion.binarySearchExRecursion(myElements, number);
            scan.nextLine();//Consume newline character

            if (index == -1) {
                System.out.println("Your value was not found in the array");
                System.out.println("\nWould you like to try again? (Y/N)");
                String answer = scan.nextLine();
                if(answer.contains("N")){
                    retry = false;
                }
            } else {
                System.out.println("Your value was found at index: " + index);
                System.out.println("\nWould you like to try again? (Y/N)");
                String answer = scan.nextLine();
                if(answer.contains("N")){
                    retry = false;
                }
            }
        }
        scan.close();
    }
}
