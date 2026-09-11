package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 11, 7, 8, 1, 8, 2};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {

        if (arr == null) {
            return;
        } else if (arr.length == 0) {
            return;
        } else {
            for (int i = 0; i < arr.length; i++) {
                int minNum = arr[i];
                int numOfMin = i;

                for (int l = i + 1; l < arr.length; l++) {
                    if (arr[l] < minNum) {
                        minNum = arr[l];
                        numOfMin = l;
                    }
                }
                arr[numOfMin] = arr[i];
                arr[i] = minNum;
            }
        }

    }

}