package com.kelaniya.uni;

import java.util.ArrayList;

public class MultiplyFileElements {
    public static Double multiplyElements(ArrayList<Double> fileData){
        double mul = 1.0; //Define variable for storing multiplication of file data

        for (double i : fileData) {
            mul = mul * i;
        }

        return mul;
    }
}
