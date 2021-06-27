package com.company;

public class Main {

    public static void main(String[] args) {
        int index, x;
        int[] array = {1,41,5,2,2,7,24,7,2,4};
        System.out.print(" ta có mảng: ");
        for (int t: array){
            System.out.print(t + " ");
        }
        System.out.println();
        for(int i = 1; i < array.length; i++){
            x = array[i];
            System.out.println("gán x = " + array[i]);
            index = i;
            System.out.println("index = " + i);
            while(index > 0 && x < array[index-1]){
                System.out.println(x + " < " + array[index - 1]);
                array[index] = array[index-1];
                System.out.println("swap ( " + x + " , " + array[index - 1] + ")" );
                index--;
            }
            System.out.println("index còn: " + index);
            array[index] = x;
            System.out.println("array["+ index+ "]"+ " = " + x);
        }
        for (int a: array){
            System.out.print(a + " ");
        }
    }
}
