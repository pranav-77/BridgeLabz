package com.pranav.dS;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 10, 3, 6, 2, 8, 9, 1, 7};
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
