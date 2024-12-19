package com.vilniustech;


public class HeapSort {
    private int swapCount = 0;
    private int comparisonCount = 0;

    public void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            swapCount++;

            heapify(arr, i, 0);
        }
        System.out.println("---------------");
        System.out.println("Number of comparisons: " + comparisonCount + " Number of swaps: " + swapCount);
        System.out.println("---------------");
        comparisonCount = 0;
        swapCount = 0;
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        if (left < n) {
            comparisonCount++;
            if (arr[left] > arr[largest]) {
                largest = left;
            }
        }

        if (right < n) {
            comparisonCount++;
            if (arr[right] > arr[largest]) {
                largest = right;
            }
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            swapCount++;

            heapify(arr, n, largest);
        }
    }
}

