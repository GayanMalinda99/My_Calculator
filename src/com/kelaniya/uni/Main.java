package com.kelaniya.uni;

import java.io.File;                           // Import the File class
import java.io.FileNotFoundException;          // Import this class to handle errors
import java.util.ArrayList;                    // Import ArrayList class
import java.util.Scanner;                      // Import Scanner class

public class Main {
    public static void main(String[] args){

        ArrayList<Double> fileData = new ArrayList<Double>();    //Creat ArrayList object for storing file data

        try {
            File myObj = new File("src/numbers.txt");   // Specify the filename
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextInt()) {                     // Read and store data to ArrayList object
                fileData.add((double) myReader.nextInt());      //Change the integer data type
                                                                // to double data type for more accuracy
            }
            myReader.close(); // Close Scanner object

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            System.exit(0);
        }

        if(fileData.size() > 0){
            OperationHandler.operations(fileData);     //Call OperationHandler class to
                                                       // take user choice and make outputs
        }
        else{
            System.out.println("Your file is Empty");
            System.exit(0);
        }

    }
}
