package com.company;

import java.sql.Array;
import java.time.chrono.MinguoChronology;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //БЫСТРАЯ СОРТИРОВКА (996)
        Number[] array = new Number[]{-3, 4, 59, 6, 95, -9, -7};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("_____________________");


        int[] arrays = new int[]{-3, 4, 59, 6, 95, -9, -7,};
        bubbleSort(arrays);
    }
    //  СОРТИРОВКА ПУЗЫРЬКОМ  (996)
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }

            }
            System.out.println(Arrays.toString(array));

        }

    }
}


