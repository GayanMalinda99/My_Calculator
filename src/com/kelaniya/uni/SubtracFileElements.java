package com.kelaniya.uni;

import java.util.ArrayList;

public class SubtracFileElements {
    public static Double multiplyElements(ArrayList<Double> fileData){
        double sub = 0.0; //Define variable for storing summation of file data

        sub = fileData.get(1) - fileData.get(0);

        return sub;
    }
}
