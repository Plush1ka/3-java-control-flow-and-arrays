package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 7, 0, 2323, 400};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {

        if (arr == null) {
            return null;
        }else {

            int countNum = 0;
            int countIter = 0;

            for (int num : arr) {
                if (num <= 1000) {
                    countNum++;
                }
            }
            int[] arrNew = new int[countNum];
            sigh:
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= 1000) {
                    for (int j = 0; j < countNum; j++) {
                        if (arrNew[j] == 0 && countIter == j) {
                            arrNew[j] = arr[i];
                            countIter ++;
                            continue sigh;
                        }
                    }
                }
            }
            return arrNew;
        }
    }

}