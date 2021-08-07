package com.kelaniya.uni;

import java.util.ArrayList;   // Import ArrayList class
import java.util.Scanner;     // Import Scanner class

public class OperationHandler {

    public static void operations(ArrayList<Double> fileData){
        Scanner scanner = new Scanner(System.in);
        int choice = 1; //Define 'choice' variable for storing user choices

        while(choice != 0){
            System.out.print("Enter which operation do you want \n(Addition = 1   Multiplication = 2   Subtraction = 3   Exit = 0) : ");
            choice = scanner.nextInt(); //Get user choice

            switch (choice) {
                case 0 -> {
                    System.out.println("Program finished");
                    scanner.close();          //Close the program
                }
                case 1 -> System.out.println(AddFileElements.addElements(fileData));           //Take and print, the addition of file data
                case 2 -> System.out.println(MultiplyFileElements.multiplyElements(fileData)); //Take and print, the multiplication of file data
                case 3 -> System.out.println(SubtracFileElements.multiplyElements(fileData));  //Take and print, the subtraction of file data
                default -> System.out.println("Choice is Invalid. Re-enter your choice");//Default option for invalid operations
            }
        }
    }
}
