package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 9, 1, 6, 8, 0};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {

        if (arr == null) {
            return;
        }else if (arr.length == 0){
            return;
        } else {
            int minNum = arr[0];
            int numOfMin = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minNum) {
                    minNum = arr[i];
                    numOfMin = i;
                }
            }
            arr[numOfMin] = arr[0];
            arr[0] = minNum;
        }
    }
}