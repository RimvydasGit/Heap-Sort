package com.vilniustech;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] smallArray1 = Utils.generateRandomArray(30);
        int[] smallArray2 = Utils.generateRandomArray(60);
        int[] smallArray3 = Utils.generateRandomArray(120);

        int[] bigArray1 = Utils.generateRandomArray(25000);
        int[] bigArray2 = Utils.generateRandomArray(50_000);
        int[] bigArray3 = Utils.generateRandomArray(100_000);

        List<int[]> smallarrays_30 = Utils.createArrayCopies(smallArray1, 11);
        List<int[]> smallarrays_60 = Utils.createArrayCopies(smallArray2, 10);
        List<int[]> smallarrays_120 = Utils.createArrayCopies(smallArray3, 10);
        List<int[]> bigArrays_25000 = Utils.createArrayCopies(bigArray1, 10);
        List<int[]> bigArrays_50_000 = Utils.createArrayCopies(bigArray2, 10);
        List<int[]> bigArrays_100_000 = Utils.createArrayCopies(bigArray3, 10);


        System.out.println("Small array size 30 sample:");
        
        Utils.printArrayAsJson(smallArray1);
        System.out.println("Please exclude very first array for system warm up");

        System.out.println("Small arrays size 30");
        sortListOfArrays(smallarrays_30);
        System.out.println("######################");
        System.out.println("Small arrays size 60");
        sortListOfArrays(smallarrays_60);
        System.out.println("######################");
        System.out.println("Small arrays size 120");
        sortListOfArrays(smallarrays_120);
        System.out.println("######################");
        System.out.println("Big arrays size 25_000");
        sortListOfArrays(bigArrays_25000);
        System.out.println("######################");
        System.out.println("Big arrays size 50_000");
        sortListOfArrays(bigArrays_50_000);
        System.out.println("######################");
        System.out.println("Big arrays size 100_000");
        sortListOfArrays(bigArrays_100_000);

    }
    public static void sortListOfArrays (List<int[]> arrayList){

        HeapSort sorter = new HeapSort();
        int numberOfArray = 0;
        for (int[] array : arrayList) {
        ++numberOfArray;
        long startTime = System.nanoTime();
        sorter.heapSort(array);
        long endTime = System.nanoTime();
        System.out.println(numberOfArray + ". Time taken: " + (endTime - startTime)/1_000_000.0 + " milliseconds");
        }
    }
}