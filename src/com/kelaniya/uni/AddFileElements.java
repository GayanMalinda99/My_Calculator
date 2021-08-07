package com.kelaniya.uni;

import java.util.ArrayList;

public class AddFileElements {
    public static Double addElements(ArrayList<Double> fileData){
        double sum = 0.0; //Define variable for storing sum of file data

        for (double i : fileData) {
            sum = sum + i;
        }

        return sum;
    }
}
