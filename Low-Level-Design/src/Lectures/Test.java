package Lectures;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr[] = {14, 16, 18, 1, 2, 6, 8, 7, 9, 3, 11, 10, 4, 19, 5};
        int n = arr.length;
        int h1 = arr[0];
        int h2 = arr[1];

        for (int i = 0; i < n; i++) {
            if (arr[i] > h1) {
                h2 = h1;
                h1 = Math.max(arr[i], h1);
            } else {
                if (arr[i] > h2) {
                    h2 = arr[i];
                }
            }
        }


        System.out.println(h2);
    }
}

/*
*     public static void main(String[] args) {
        int arr[] = {1, 2, 6, 7, 3, 4, 5};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n - 2]);
    }
* */