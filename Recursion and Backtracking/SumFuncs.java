package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SumFuncs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(sumFuncFromStart(arr, 0));
        System.out.println(sumFuncFromEnd(arr, arr.length - 1));

    }

    private static int sumFuncFromStart(int[] arr, int index) {

        if (index >= arr.length) {
            return 0;
        }

        return arr[index] + sumFuncFromStart(arr, index + 1);
    }

    private static int sumFuncFromEnd(int[] arr, int index) {

        if (index < 0) {
            return 0;
        }

        return arr[index] + sumFuncFromEnd(arr, index - 1);
    }

}
