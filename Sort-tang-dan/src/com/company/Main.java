package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 12, 234, 77, 23, 72, 62, 23};
        int x, index;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            index = i;
            while (index > 0 && x < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = x;
        }
        for (int a: arr){
            System.out.print(a + " ");
        }
    }
}
