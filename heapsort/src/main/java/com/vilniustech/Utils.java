package com.vilniustech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;


public class Utils {
    
    public static void printArray(int[] arr) {
    
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void printArrayAsJson(int[] arr) {
        Gson gson = new Gson();
        try {
            String jsonString = gson.toJson(arr);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1_000_000) + 1; 
        }
        return arr;
    }
     public static List<int[]> createArrayCopies(int[] originalArray, int numberOfCopies) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < numberOfCopies; i++) {
            result.add(Arrays.copyOf(originalArray, originalArray.length));
        }
        return result;
    }
}
